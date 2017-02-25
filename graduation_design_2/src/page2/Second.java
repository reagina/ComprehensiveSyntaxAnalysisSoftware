package page2;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Second extends JFrame implements ActionListener{
	/**
	 * @author CRR
	 */
	private static final long serialVersionUID = 1L;
	NewPanelsec jp1 ;
	JLabel jl;
	JButton jb1,jb2,jb3,jb4,jb5;
	
	public Second()
	{
		//��ʼ������
		init();
	}
	
	public void init()
	{
		ImageIcon icon = new ImageIcon("images/1a.png");
		this.setIconImage(icon.getImage());
		this.setTitle("�ۺ��﷨��������������ʵ��");
		//����panel
		jp1 = new NewPanelsec();
		jp1.setLayout(null);
		jp1.setBounds(0, 0, 1000, 700);
		
		
		
		jb1 = new JButton();//"Ԥ�����"
		jb2 = new JButton();//"������ȷ���"
		jb3 = new JButton();//"LR����"
		jb4 = new JButton();//"����"
		jb5 = new JButton();//"Ӣ��"
		//jb1.setFont(new Font("�����п�", 0, 50));
		jb2.setFont(new Font("�����п�", 0, 43));
		jb3.setFont(new Font("�����п�", 0, 40));
		jb4.setFont(new Font("�����п�", 0, 20));
		jb5.setFont(new Font("�����п�", 0, 25));
		jb1.setBounds(400, 245, 235, 70);
		jb2.setBounds(400, 320, 325, 70);
		jb3.setBounds(400, 395, 200, 70);
		jb4.setBounds(870, 590, 85, 40);
		jb5.setBounds(770, 590, 85, 40);
		jb1.setContentAreaFilled(false);
		jb1.setOpaque(false);
		jb2.setContentAreaFilled(false);
		jb2.setOpaque(false);
		jb3.setContentAreaFilled(false);
		jb3.setOpaque(false);
		jb4.setContentAreaFilled(false);
		jb4.setOpaque(false);
		jb5.setContentAreaFilled(false);
		jb5.setOpaque(false);
		jb4.setBorderPainted(false);
		jb5.setBorderPainted(false);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		
		jp1.add(jb5);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jb4);
		
		this.add(jp1);
		this.setBounds(180, 20, 1000, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}
	
	public static void main(String[] args)
	{
		new Second();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jb4)
		{
			Firstpage.fp.setVisible(true);//���ص�һ��ҳ�水ť
			this.setVisible(false);
		}
		if(e.getSource()==jb5)
		{
			new Secondpage();//�л���Ӣ�Ľ��水ť
			this.setVisible(false);
		}
		if(e.getSource()==jb1)
		{
			new Forecast();//����Ԥ�����ҳ��
			this.setVisible(false);
		}
		if(e.getSource()==jb2)
		{
			new Operator();//����������ȷ���ҳ��
			this.setVisible(false);
		}
		if(e.getSource()==jb3)
		{
			new LR();//����LR����ҳ��
			this.setVisible(false);
		}
	}
}

class NewPanelsec extends JPanel
{
	/**
	 * @author CRR
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g)
	{
		ImageIcon icon = new ImageIcon("images/2.png");
		g.drawImage(icon.getImage(), 0, 0, getSize().width, getSize().height, this);	
	}
}

