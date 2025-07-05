import com.kms.katalon.core.annotation.Keyword


public class MyKeywordDemo {
	@Keyword
	def hello() {
		println "hello World"
	}
	@Keyword(keywordObject = "Brower Hello")
	def helloUser(String user) {
		println("Hello " +user)
	}
}
