package example

import com.typesafe.scalalogging.Logger

object Hello extends Greeting with App {
  val logger = Logger("example")
  logger.info(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
}
