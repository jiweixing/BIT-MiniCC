import os
import colorama.ansi as ansi
from encodings.utf_16_le import decode


def get_original_content(path):
    # Potential encoding set
    PES = ["UTF-8", "GBK", "GB18030", "UTF-16LE", "UTF-16BE"]
    for encoding in PES:
        try:
            f = open(path, "r", encoding=encoding)
            content = f.read()
            f.close()
            return content
        except Exception as e:
            print(e)
    print(ansi.Fore.RED+path+" can't be fixed."+ansi.Fore.RESET)
    print(ansi.Fore.RED+"Entering fixing mode."+ansi.Fore.RESET)
    f = open(path, "rb")
    raw_content = f.read()
    new_content = ""

    for SE in PES:  # Special encoding
        try:
            p1 = 2
            while True:
                p2 = raw_content.find(r"//".encode(SE), p1)
                if p2 == -1:
                    break
                p2 += 4
                p3 = raw_content.find("\n".encode(SE), p2)
                healthy_content = raw_content[p1:p2]
                new_content += healthy_content.decode(SE)

                sick_content = raw_content[p2:p3]
                sick_content = sick_content.decode(SE, errors="ignore")
                try:
                    sick_content.encode("ASCII")
                except:
                    sick_content = sick_content.encode(
                        "GB18030", errors="ignore")
                    sick_content = sick_content.decode(
                        "UTF-8", errors="ignore")
                new_content += sick_content
                assert p2 > p1
                p1 = p3
                p2 = None
                p2 = None
            new_content += raw_content[p1:].decode(encoding=SE)
            return new_content
        except:
            pass


for home, dirs, files in os.walk("src/bit/minisys/minicc"):
    for file in files:
        f = None
        content = None
        if not os.path.exists("recovery/"+home):
            os.makedirs("recovery/"+home)
        path = home+'/'+file

        content = get_original_content(path)
        if content:
            f = open("recovery/"+path, "w", encoding="UTF-8")
            f.write(content)
            f.close()
