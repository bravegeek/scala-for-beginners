package lectures

object Functions extends App {

  def aGreetingFunction(name: String, age: Int) = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }

  println(aGreetingFunction("Greg", 46))
}
