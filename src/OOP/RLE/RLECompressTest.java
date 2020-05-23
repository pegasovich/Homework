package OOP.RLE;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RLECompressTest {

    @Test
    void encodeWithoutDigits() {
        RLECompress rleCompress = new RLECompress();
        String result = rleCompress.encode("AaaaBB");
        assertEquals("1A3a2B", result);
    }

    @Test
    void encodeWithDigits() {
        RLECompress rleCompress = new RLECompress();
        String result = rleCompress.encode("AaaaBB2");
        assertEquals("1A3a2B\\2", result);
    }

    @Test
    void encodeWithSlashes() {
        RLECompress rleCompress = new RLECompress();
        String result = rleCompress.encode("AaaaBB\\\\2");
        assertEquals("1A3a2B\\\\\\\\\\2", result);
    }

    @Test
    void decodeWithoutDigits() {
        RLECompress rleCompress = new RLECompress();
        String result = rleCompress.decode("1A3a2B");
        assertEquals("AaaaBB", result);
    }

    @Test
    void decodeWithDigits() {
        RLECompress rleCompress = new RLECompress();
        String result = rleCompress.decode("1A3a2B\\2");
        assertEquals("AaaaBB2", result);
    }

    @Test
    void decodeWithSlashes() {
        RLECompress rleCompress = new RLECompress();
        String result = rleCompress.decode("4A3a6B\\\\\\1\\2");
        assertEquals("AAAAaaaBBBBBB\\12", result);
    }

    @Test
    void decodeWithOtherSlashes() {
        RLECompress rleCompress = new RLECompress();
        String result = rleCompress.decode("\\\\\\1\\2");
        assertEquals("\\12", result);
    }
}