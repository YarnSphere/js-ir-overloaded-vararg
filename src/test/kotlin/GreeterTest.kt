import kotlin.test.Test
import kotlin.test.assertEquals

class GreeterTest {
    @Test
    fun testGreetAll() {
        assertEquals("Hello Alice, Bob", Greeter().greetAll("Alice", "Bob"))
    }
}
