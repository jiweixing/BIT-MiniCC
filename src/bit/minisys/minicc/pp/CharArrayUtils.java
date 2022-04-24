package bit.minisys.minicc.pp;
/**
 * @author dschaefe
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CharArrayUtils {

	public static final int hash(char[] str, int start, int length) {
		int h = 0;
		int end = start + length;
		
		for (int curr = start; curr < end; ++curr)
			h += (h << 3) + str[curr];

		return h;
	}

	public static final int hash(char[] str) {
		return hash(str, 0, str.length);
	}
	
	public static final boolean equals(char[] str1, char[] str2) {
		if (str1 == str2)
			return true;
		
		if (str1.length != str2.length)
			return false;
		
		for (int i = 0; i < str1.length; ++i)
			if (str1[i] != str2[i])
				return false;
		
		return true;
	}
	
	public static final boolean equals(char[] str1, int start1, int length1, char[] str2) {
		if (length1 != str2.length || str1.length < length1 )
			return false;
		if( str1 == str2 && start1 == 0 )
		    return true;
		for (int i = 0; i < length1; ++i)
			if (str1[start1++] != str2[i])
				return false;
		
		return true;
	}
	
	public static final boolean equals(char[] str1, int start1, int length1, char[] str2, boolean ignoreCase ) {
	    if( !ignoreCase )
	        return equals( str1, start1, length1, str2 );
	    
		if (length1 != str2.length || str1.length < length1 )
			return false;
		
		for (int i = 0; i < length1; ++i)
			if( Character.toLowerCase(str1[start1++]) != Character.toLowerCase( str2[i] ) )
				return false;
		
		return true;
	}
	
	public static final char[] extract(char[] str, int start, int length) {
		if (start == 0 && length == str.length)
			return str;
		
		char[] copy = new char[length];
		System.arraycopy(str, start, copy, 0, length);
		return copy;
	}
	
	public static final char[] concat(char[] first, char[] second) {
		if (first == null)
			return second;
		if (second == null)
			return first;

		int length1 = first.length;
		int length2 = second.length;
		char[] result = new char[length1 + length2];
		System.arraycopy(first, 0, result, 0, length1);
		System.arraycopy(second, 0, result, length1, length2);
		return result;
	}
	
	public static final char[] replace(
		char[] array,
		char[] toBeReplaced,
		char[] replacementChars) {

		int max = array.length;
		int replacedLength = toBeReplaced.length;
		int replacementLength = replacementChars.length;

		int[] starts = new int[5];
		int occurrenceCount = 0;

		if (!equals(toBeReplaced, replacementChars)) {

			next : for (int i = 0; i < max; i++) {
				int j = 0;
				while (j < replacedLength) {
					if (i + j == max)
						continue next;
					if (array[i + j] != toBeReplaced[j++])
						continue next;
				}
				if (occurrenceCount == starts.length) {
					System.arraycopy(
						starts,
						0,
						starts = new int[occurrenceCount * 2],
						0,
						occurrenceCount);
				}
				starts[occurrenceCount++] = i;
			}
		}
		if (occurrenceCount == 0)
			return array;
		char[] result =
			new char[max
				+ occurrenceCount * (replacementLength - replacedLength)];
		int inStart = 0, outStart = 0;
		for (int i = 0; i < occurrenceCount; i++) {
			int offset = starts[i] - inStart;
			System.arraycopy(array, inStart, result, outStart, offset);
			inStart += offset;
			outStart += offset;
			System.arraycopy(
				replacementChars,
				0,
				result,
				outStart,
				replacementLength);
			inStart += replacedLength;
			outStart += replacementLength;
		}
		System.arraycopy(array, inStart, result, outStart, max - inStart);
		return result;
	}

	public static final char[][] subarray(char[][] array, int start, int end) {
		if (end == -1)
			end = array.length;
		if (start > end)
			return null;
		if (start < 0)
			return null;
		if (end > array.length)
			return null;

		char[][] result = new char[end - start][];
		System.arraycopy(array, start, result, 0, end - start);
		return result;
	}

	public static final char[] subarray(char[] array, int start, int end) {
		if (end == -1)
			end = array.length;
		if (start > end)
			return null;
		if (start < 0)
			return null;
		if (end > array.length)
			return null;

		char[] result = new char[end - start];
		System.arraycopy(array, start, result, 0, end - start);
		return result;
	}
	
	public static final int indexOf(char toBeFound, char[] array) {
		for (int i = 0; i < array.length; i++)
			if (toBeFound == array[i])
				return i;
		return -1;
	}
	
    public static int indexOf( char toBeFound, char[] buffer, int start, int len ) {
        if( start < 0 || start > buffer.length || start + len > buffer.length )
            return -1;
        
        for (int i = start; i < len; i++)
			if (toBeFound == buffer[i])
				return i;
		return -1;
    }
	public static final int indexOf( char[] toBeFound, char[] array ){
	    if( toBeFound.length > array.length )
	        return -1;
	    
	    int j = 0;
	    for( int i = 0; i < array.length; i++ ){
	        if( toBeFound[j] == array[i] ){
	            if( ++j == toBeFound.length )
	                return i - j + 1;
	        }
	        else j = 0; 
	    }
	    return -1;
	}
	
	public static final int lastIndexOf(char[] toBeFound, char[] array) {
	    int j = toBeFound.length - 1;
		for (int i = array.length; --i >= 0;){
			if (toBeFound[j] == array[i]){
			    if( --j == -1 )
			        return i;
			} else j = toBeFound.length - 1;
		}
		return -1;
	}
	
	final static public char[] trim(char[] chars) {

		if (chars == null)
			return null;

		int start = 0, length = chars.length, end = length - 1;
		while (start < length && chars[start] == ' ') {
			start++;
		}
		while (end > start && chars[end] == ' ') {
			end--;
		}
		if (start != 0 || end != length - 1) {
			return subarray(chars, start, end + 1);
		}
		return chars;
	}

	
	final static public char[] lastSegment(char[] array, char[] separator) {
		int pos = lastIndexOf(separator, array);
		if (pos < 0)
			return array;
		return subarray(array, pos + separator.length, array.length);
	}

    /**
     * @param buff
     * @param i
     * @param charImage
     */
    public static void overWrite( char[] buff, int i, char[] charImage ) {
        if( buff.length < i + charImage.length )
            return;
        for( int j = 0; j < charImage.length; j++ ){
            buff[ i + j ] = charImage[j];
        }
    }


}
