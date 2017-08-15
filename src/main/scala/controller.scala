package hello
import org.springframework.web.bind.annotation._
import org.springframework.stereotype._
import org.springframework.beans.factory.annotation.Autowired
@Controller
@ResponseBody
class controller @Autowired ()(val m:my){
   
   @RequestMapping(Array("/list/{sql}"))  
     def list(@PathVariable(value = "sql") sql:String):String={
      val result=m.query(sql)
      //val s="{\"result\":"+result+"}"
      println(result)
      result
    }
}
