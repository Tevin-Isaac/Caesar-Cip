package CeaserCipher;

class CeaserCipher {
    // This rotates a character k-positions

    private String mText;
    private int mShift;

    CeaserCipher.CeaserCipher(String mText, int mShift) {
        this.mText = mText;
        this.mShift = mShift;
    }

    public String getText() {
        return mText;
    }

    public int getShift() {
        return mShift;
    }

    static char cipher(char c, int k) {
        // declare some helping constants
        final int alphaLength = 26;
        final char asciiShift = Character.isUpperCase(c) ? 'A' : 'a';
        final int cipherShift = k % alphaLength;

        // shift down to 0..25 for a..z
        char shifted = (char) (c - asciiShift);

        //  rotate the letter and handle "wrap-around" for negatives and value >= 26
        shifted = (char) ((shifted + cipherShift + alphaLength) % alphaLength);

        // shift back up to english characters
        return (char) (shifted + asciiShift);
    }

    //  Rotate a string k-positions
    String cipher() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mText.length(); i++) {
            if(mText.charAt(i) == ' ')
            {
                sb.append(" ");
            }
            else
            {
                sb.append(cipher(mText.charAt(i), mShift));
            }

        }
        return sb.toString();
    }
}