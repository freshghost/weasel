package hello;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

/**
 * Created by sunxiebin on 2017/4/8.
 */
public class jsonPaserTool {


        /*Json trans to Map*/
    static Map<String,Object> paser(String s) throws IOException {
        Map<String,Object> json=(Map<String,Object>) paser(s,Map.class);
        return  json;
    }

    /* Json trans to object*/
    static Object paser(String s,Class o) throws IOException {

        ObjectMapper ob=new ObjectMapper();
        try{
            ob.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
            ob.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
            Object Json=ob.readValue(s, o);
            return Json;
        }catch (Exception e){
            e.printStackTrace();
            return  null;
        }
    }

   /*class trans to json*/
   public  String beanToJson(Object o) throws JsonProcessingException{
      ObjectMapper mapper=new ObjectMapper();
      String json=mapper.writeValueAsString(o);
      return json;
   }
   /*json to List */
  static  String listToJson(List a ) throws JsonProcessingException{
     ObjectMapper mapper=new ObjectMapper();
     String  json=mapper.writeValueAsString(a);
     return json;
  }
}

