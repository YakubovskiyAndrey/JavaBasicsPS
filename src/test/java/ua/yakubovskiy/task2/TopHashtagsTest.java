package ua.yakubovskiy.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TopHashtagsTest {

    private TopHashtags topHashtags;

    @BeforeEach
    void setUp() {
        topHashtags = new TopHashtags();
    }

    @Test
    void whenListIsEmpty(){
        assertThrows(IllegalArgumentException.class, () -> topHashtags.chooseTop(new ArrayList<>()));
    }

    @Test
    void whenListIsNull(){
        assertThrows(NullPointerException.class, () -> topHashtags.chooseTop(null));
    }

    @Test
    void getTop5Hashtags(){
        List<String> lines = new ArrayList<>();
        lines.add("-1");
        lines.add("#tt");
        lines.add("#bb");
        lines.add("#bb");
        lines.add("#tbb");
        lines.add("#ppp");
        lines.add("rr");
        lines.add("#r");
        lines.add("#r");
        lines.add("#r");
        lines.add("#r");
        lines.add("#y");
        lines.add("#y");
        lines.add("#y");
        lines.add("#y");
        lines.add("#i");
        lines.add("#i");
        lines.add("#i");
        lines.add("#tt");
        lines.add("#tt");
        lines.add("#tt");
        lines.add("#tt");
        lines.add("#tt");
        lines.add("#r");
        assertEquals("{#tt=6, #r=5, #y=4, #i=3, #bb=2}",
                topHashtags.chooseTop(lines).toString());
    }

    @Test
    void whenNoHashtags(){
        List<String> lines = new ArrayList<>();
        lines.add("ff");
        lines.add("bb");
        assertTrue(topHashtags.chooseTop(lines).isEmpty());
    }

    @Test
    void whenSeveralHashtagsInLine(){
        List<String> lines = new ArrayList<>();
        lines.add("ff");
        lines.add("bb");
        lines.add("#b#b");
        lines.add("#b#b");
        assertEquals("{#b#b=2}",
                topHashtags.chooseTop(lines).toString());
    }
}