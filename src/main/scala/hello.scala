package hello

import org.springframework.boot._
import org.springframework.boot.autoconfigure._
import org.springframework.web.bind.annotation._
@SpringBootApplication 
class hello(){   

}
object hello {

   def main(args:Array[String]){

     SpringApplication.run(classOf[hello])}
}
