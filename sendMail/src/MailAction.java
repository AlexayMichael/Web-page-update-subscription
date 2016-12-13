package sendMail;

public class MailAction {
	@SuppressWarnings("static-access")
	public static void main(String[] args){  
        //这个类主要是设置邮件  
     MailSenderInfo mailInfo = new MailSenderInfo();   
     mailInfo.setMailServerHost("smtp.163.com");   
     mailInfo.setMailServerPort("25");   
     mailInfo.setValidate(true);   
     mailInfo.setUserName("hitzhangyj@163.com");   
     mailInfo.setPassword("qaz12345");//您的邮箱密码   
     mailInfo.setFromAddress("hitzhangyj@163.com");   
     mailInfo.setToAddress("790681802@qq.com");   
     mailInfo.setSubject("你好！");//邮件主题  
     mailInfo.setContent("第三次测试");//邮件内容
        //这个类主要来发送邮件  
      SimpleMailSender sms = new SimpleMailSender();  
      sms.sendTextMail(mailInfo);//发送文体格式   
      sms.sendHtmlMail(mailInfo);//发送html格式 
   }
}