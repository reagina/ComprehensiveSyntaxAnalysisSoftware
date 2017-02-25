package page2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Secondpage extends JFrame implements ActionListener{
	/**
	 * @author CRR
	 */
	private static final long serialVersionUID = 1L;
	NewPanelsec2 jp1 ;
	JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6;
	JButton jb1,jb2,jb3,jb4,jb5;
	
	public Secondpage()
	{
		//初始化界面
		init();
	}
	
	public void init()
	{
		ImageIcon icon = new ImageIcon("images/1a.png");
		this.setIconImage(icon.getImage());
		this.setTitle("综合语法分析软件的设计与实现");
		//背景panel
		jp1 = new NewPanelsec2();
		jp1.setLayout(null);
		jp1.setBounds(0, 0, 1000, 700);
		
		jl6 = new JLabel("Syntax analysis");
		jl6.setBounds(540, 10, 450, 100);
		jl6.setFont(new Font("arial", 1, 60));
		jl6.setForeground(new Color(108, 197, 232));
		jp1.add(jl6);
		
		jb1 = new JButton();//"预测分析"
		jb2 = new JButton();//"算符优先分析"
		jb3 = new JButton();//"LR分析"
		jb4 = new JButton();//"返回"
		jb5 = new JButton();//"英文"
		
		jb1.setBounds(400, 245, 500, 70);
		jb2.setBounds(400, 320, 580, 70);
		jb3.setBounds(400, 395, 400, 70);
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
		
		jl1 = new JLabel("Forecast analysis");
		jl2 = new JLabel("Operator priority analysis");
		jl3 = new JLabel("LR analysis");
		jl4 = new JLabel("return");
		jl5 = new JLabel("Chinese");
		jl1.setFont(new Font("arial", 1, 45));
		jl2.setFont(new Font("arial", 1, 45));
		jl3.setFont(new Font("arial", 1, 45));
		jl4.setFont(new Font("arial", 0, 20));
		jl5.setFont(new Font("arial", 0, 18));
		jl1.setForeground(new Color(108, 197, 232));
		jl2.setForeground(new Color(108, 197, 232));
		jl3.setForeground(new Color(108, 197, 232));
//		jl1.setHorizontalAlignment((int) LEFT_ALIGNMENT);
//		jl2.setHorizontalAlignment((int) LEFT_ALIGNMENT);
//		jl3.setHorizontalAlignment((int) LEFT_ALIGNMENT);
		jl1.setBounds(420, 245, 500, 70);
		jl2.setBounds(420, 320, 580, 70);
		jl3.setBounds(420, 395, 400, 70);
		jl4.setBounds(890, 595, 85, 30);
		jl5.setBounds(780, 595, 85, 30);
		
		jp1.add(jb5);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jb4);
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl3);
		jp1.add(jl4);
		jp1.add(jl5);
		
		this.add(jp1);
		this.setBounds(180, 20, 1000, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}
	
	public static void main(String[] args)
	{
		new Secondpage();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//返回第一个页面按钮
		if(e.getSource()==jb4)
		{
			Firstpage.fp.setVisible(true);
			this.setVisible(false);
		}
		//切换成英文界面按钮
		if(e.getSource()==jb5)
		{
			new Second();
			this.setVisible(false);
		}
		//进入预测分析页面
		if(e.getSource()==jb1)
		{
			new ForecastPage();
			this.setVisible(false);
		}
		//进入算符优先分析页面
		if(e.getSource()==jb2)
		{
			new OperatorPage();
			this.setVisible(false);
		}
		//进入LR分析页面
		if(e.getSource()==jb3)
		{
			new LRpage();
			this.setVisible(false);
		}
	}
}

class NewPanelsec2 extends JPanel
{
	/**
	 * @author CRR
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g)
	{
		ImageIcon icon = new ImageIcon("images/02.png");
		g.drawImage(icon.getImage(), 0, 0, getSize().width, getSize().height, this);	
	}
}

