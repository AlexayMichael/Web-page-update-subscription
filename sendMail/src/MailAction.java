package sendMail;

public class MailAction {
	@SuppressWarnings("static-access")
	public static void main(String[] args){  
        //�������Ҫ�������ʼ�  
     MailSenderInfo mailInfo = new MailSenderInfo();   
     mailInfo.setMailServerHost("smtp.163.com");   
     mailInfo.setMailServerPort("25");   
     mailInfo.setValidate(true);   
     mailInfo.setUserName("hitzhangyj@163.com");   
     mailInfo.setPassword("qaz12345");//������������   
     mailInfo.setFromAddress("hitzhangyj@163.com");   
     mailInfo.setToAddress("790681802@qq.com");   
     mailInfo.setSubject("��ã�");//�ʼ�����  
     mailInfo.setContent("�����β���");//�ʼ�����
        //�������Ҫ�������ʼ�  
      SimpleMailSender sms = new SimpleMailSender();  
      sms.sendTextMail(mailInfo);//���������ʽ   
      sms.sendHtmlMail(mailInfo);//����html��ʽ 
   }
}