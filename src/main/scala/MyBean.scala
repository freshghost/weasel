package hello
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Component
import scala.collection.JavaConverters._
@Component
 abstract class MyBean(){
   @Autowired
 val jdbcTemplate:JdbcTemplate=null
  
  /** query hive database ,use jdbcTemplate
     @param sql  hive sql sentence
     @return  the result of query
  */
   def query(sql:String):String={
 val result=jdbcTemplate.queryForList(sql)
     println(result)
     println(result.getClass)
      val json=jsonPaserTool.listToJson(result)
      println(json)
      json
    }  
}
