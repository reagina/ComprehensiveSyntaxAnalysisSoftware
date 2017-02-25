package page2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.Player;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Firstpage extends JFrame implements ActionListener{
	/**
	 * @author CRR
	 */
	private static final long serialVersionUID = 1L;

	JButton button;
	NewPanel panel;
	public static JLabel jl,jl2,jl3,jl4,jl5;
	public static Firstpage fp;
	Player player = null;
	
	public Firstpage()
	{
		//�������ֲ�����
		File mufile = new File("a Time For Us.mp3");
		try
		{
			if(player==null)
			{
				if(mufile.exists())
				{
					MediaLocator locator = new MediaLocator("file:"+mufile.getAbsolutePath());
					player = Manager.createRealizedPlayer(locator);
					player.prefetch();
				}
			}
			player.start();
			add(player.getControlPanelComponent(),"South");
			double lx = 200;
			double ly = 100;
			setLocation((int)lx/2-200,(int)ly/2-150);
			((Dimension) player).setSize(400,300);
		}catch(Exception e)
		{
			e.getStackTrace();
		}
		//���ý����ʼ����������ɽ���ĳ�ʼ��
		init();
	}
	
	public void init()
	{
		//icon
		ImageIcon icon = new ImageIcon("images/1a.png");
		this.setIconImage(icon.getImage());
		
		jl = new JLabel();//�����﷨�����㷨�������ʵ��
		jl.setBounds(0, 260, 1000, 100);
		jl.setFont(new Font("΢���ź�",1,50));
		jl.setVerticalAlignment((int) CENTER_ALIGNMENT);
		jl.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		jl2 = new JLabel();//����
		jl2.setBounds(0, 390, 1000, 30);
		jl2.setFont(new Font("΢���ź�",0,25)); 
		jl3 = new JLabel();//�༶
		jl3.setBounds(0, 430, 1000, 30);
		jl3.setFont(new Font("΢���ź�",0,25));
		jl4 = new JLabel();//ѧ��
		jl4.setBounds(0, 470, 1000, 30);
		jl4.setFont(new Font("΢���ź�",0,25));
		jl5 = new JLabel();//ָ����ʦ
		jl5.setBounds(0, 517, 1000, 30);
		jl5.setFont(new Font("΢���ź�",0,25));
		jl2.setVerticalAlignment((int) CENTER_ALIGNMENT);
		jl2.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		jl3.setVerticalAlignment((int) CENTER_ALIGNMENT);
		jl3.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		jl4.setVerticalAlignment((int) CENTER_ALIGNMENT);
		jl4.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		jl5.setVerticalAlignment((int) CENTER_ALIGNMENT);
		jl5.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		jl.setForeground(Color.black);
		jl2.setForeground(Color.black);
		jl3.setForeground(Color.black);
		jl4.setForeground(Color.black);
		jl5.setForeground(Color.black);
		
		//go ahead ��ť
		button = new JButton();//"go ahead"
		button.setBounds(200, 260, 600, 80);
		button.setFont(new Font("Palace Script MT",0,60));
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBackground(getBackground());
		button.addActionListener(this);
		
		//����panel
		panel = new NewPanel();
		panel.startPlay();
		panel.setLayout(null);
		panel.add(button);
		panel.add(jl);
		panel.add(jl2);
		panel.add(jl3);
		panel.add(jl4);
		panel.add(jl5);
		this.add(panel);
		this.setBounds(180, 20, 1000, 700);
		this.setTitle("�ۺ��﷨��������������ʵ��");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		fp = new Firstpage();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//go ahead��ť
		if(e.getSource()==button)
		{
			new Second();
			fp.setVisible(false);
		}
		
	}
}

class NewPanel extends JPanel 
{
	String s = "�ۺ��﷨�������";
	String s2 = "������������";
	String s3 = "�༶��13���������ѧ�뼼��";
	String s4 = "ѧ�ţ�20134042045";
	String s5 = "ָ����ʦ��Ī��ƽ";
	/**
	 * @author CRR
	 */
	private static final long serialVersionUID = 1L;
	//��ʼ��jpanel����

	
	public void paintComponent(Graphics g)
	{
		ImageIcon icon = new ImageIcon("images/13.png");
		g.drawImage(icon.getImage(), 0, 0, getSize().width, getSize().height, this);
	}
	public void repeat()
	{
		repaint();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void startPlay()
	{
		new Thread(){
			public void run()
			{
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				Firstpage.jl.setForeground(new Color(108, 197, 232));
				for(int i=1;i<=s.length();i++)
				{
					Firstpage.jl.setText(s.substring(0,i));
					repeat();
				}
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				for(int i=1;i<=s2.length();i++)
				{
					Firstpage.jl2.setText(s2.substring(0,i));
					repeat();
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				for(int i=1;i<=s3.length();i++)
				{
					Firstpage.jl3.setText(s3.substring(0,i));
					repeat();
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				for(int i=1;i<=s4.length();i++)
				{
					Firstpage.jl4.setText(s4.substring(0,i));
					repeat();
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Firstpage.jl5.setForeground(Color.white);
				
				for(int i=1;i<=s5.length();i++)
				{
					Firstpage.jl5.setText(s5.substring(0,i));
					repeat();
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
					
			}
		}.start();
	}
}	
