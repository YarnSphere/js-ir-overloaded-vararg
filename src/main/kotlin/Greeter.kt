data class Wrapper(val string: String)

open class Greeter {
    fun greetAll(vararg names: Wrapper) = "Hello ${names.joinToString { it.string }}"

    fun greetAll(vararg names: String) = greetAll(*names.map { Wrapper(it) }.toTypedArray())
}
