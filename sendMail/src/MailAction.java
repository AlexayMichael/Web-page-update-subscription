package sendMail;

public class MailAction {
	@SuppressWarnings("static-access")
	public static void main(String[] args){  
        //这个类主要是设置邮件  
     MailSenderInfo mailInfo = new MailSenderInfo();   
     mailInfo.setMailServerHost("smtp.yeah.net");   
     mailInfo.setMailServerPort("25");   
     mailInfo.setValidate(true);   
     
     mailInfo.setUserName("*****@yeah.net");   
     mailInfo.setPassword("******");//您的邮箱密码   
     mailInfo.setFromAddress("*****@yeah.net");   
     mailInfo.setToAddress("****@qq.com");   
     
     mailInfo.setSubject("你好！");//邮件主题  
     mailInfo.setContent("这是一个测试");//邮件内容
        
     //这个类主要来发送邮件  
      SimpleMailSender sms = new SimpleMailSender();  
      sms.sendTextMail(mailInfo);//发送文体格式   
      sms.sendHtmlMail(mailInfo);//发送html格式 
   }
}