package sendMail;

public class MailAction {
	@SuppressWarnings("static-access")
	public static void main(String[] args){  
        //�������Ҫ�������ʼ�  
     MailSenderInfo mailInfo = new MailSenderInfo();   
     mailInfo.setMailServerHost("smtp.yeah.net");   
     mailInfo.setMailServerPort("25");   
     mailInfo.setValidate(true);   
     
     mailInfo.setUserName("*****@yeah.net");   
     mailInfo.setPassword("******");//������������   
     mailInfo.setFromAddress("*****@yeah.net");   
     mailInfo.setToAddress("****@qq.com");   
     
     mailInfo.setSubject("��ã�");//�ʼ�����  
     mailInfo.setContent("����һ������");//�ʼ�����
        
     //�������Ҫ�������ʼ�  
      SimpleMailSender sms = new SimpleMailSender();  
      sms.sendTextMail(mailInfo);//���������ʽ   
      sms.sendHtmlMail(mailInfo);//����html��ʽ 
   }
}