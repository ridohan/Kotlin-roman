package i_introduction._0_Hello_World

import compress
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import simplify
import sortNumber
import sum
import task0

class RomanNumberTest {
    @Test
    fun testOk() {
        assertEquals("Hello Bitch", task0())
    }

    @Test
    fun testSimplify(){
        assertEquals("IIII",simplify("IV"))
        assertEquals("XIIII",simplify("XIV"))
        assertEquals("VIIII",simplify("IX"))
        assertEquals("DCCCCXXXXVIIII",simplify("CMXLIX"))

        assertEquals("",simplify(""))
    }

    @Test
    fun testSortNumber(){
        assertEquals("XVIII",sortNumber("VIIIX"))
        assertEquals("MCLXVI",sortNumber("CMLXVI"))
        assertEquals("",sortNumber(""))
        assertEquals("MDCLXVI",sortNumber("IVXLCDM"))
        assertEquals("XVVVIII",sortNumber("IVIVXIV"))

    }

    @Test
    fun testCompress(){
        assertEquals("",compress(""))
        assertEquals("X",compress("VIIIII"))
        assertEquals("XV",compress("XV"))
        assertEquals("CV",compress("CIIIII"))
        assertEquals("MDC",compress("MCCCCCC"))
        assertEquals("XVII",compress("IIIIIIIIIIIIIIIII"))
    }

    @Test
    fun testSum(){
        assertEquals("",sum("",""))
        assertEquals("XVI",sum("V","XI"))
        assertEquals("MMMXLVIII",sum("DCXCIV","MMCCCLIV"))

    }
}
