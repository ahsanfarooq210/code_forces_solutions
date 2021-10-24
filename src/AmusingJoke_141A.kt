import java.util.*
import javax.xml.stream.events.Characters

fun main(args:Array<String>)
    {
        var a: String? = readLine()
        var achar= a?.toCharArray()
        var b= readLine()
        var bchar= b?.toCharArray()
        var c= readLine()
        var cchar= c?.toCharArray()
        
        var d:CharArray=achar!!+ bchar!!

        Arrays.sort(d)
        Arrays.sort(cchar)
        if(cchar!!.contentEquals(d))
        {
            println("YES")
        }
        else
        {
            println("NO")
        }


        
    }
