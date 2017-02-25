package page2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ForecastPage extends JFrame implements ActionListener{
	/**
	 * @author CRR
	 */
	private static final long serialVersionUID = 1L;
	NewPanelfore2 jp1;
	JPanel jp2;
	JRadioButton jrb1,jrb2,jrb3,jrb4,jrb5;
	ButtonGroup group;
	JLabel ja1,ja2,ja3,ja4,jb1,jb2,jb3,jb4,jc1,jc2,jc3,jd1,jd2,je1,je2,je3,je4;
	JLabel jl1,jl2,jl3,jl4,jl5,jl6;
	JTable jt;
	JTextArea jta;
	JTextField jtf;
	JButton jbut1,jbut2,jbut3,jbut4;
	MyButton2 button;
	
	int flag = 0;
	String vt_tou[] = {};
	String shuju[][]={};
	String vt_tou_1[]={"","+","*","(",")","m","#"};
	String shuju_1[][]= {{"S","","","→AT","","→AT",""},
		{"A","","","→BU","","→BU",""},
		{"T","→+AT","","","→ε","","→ε"},
		{"U","→ε","→*BU","","→ε","","→ε"},
		{"B","","","→(S)","","→m",""}};
	String vt_tou_2[]={"","i","+","*","(",")","#"};
	String shuju_2[][]= {{"E","→TH","","","→TH","",""},
			{"H","","→+TH","","","→ε","→ε"},
			{"T","→FL","","","→FL","",""},
			{"L","","→ε","→*FL","","→ε","→ε"},
			{"F","→i","","","→(E)","",""}};
	String vt_tou_3[]={"","a","d","b","e","#"};
	String shuju_3[][]= {{"S","→aH","","","",""},
			{"H","→aMd","→d","","",""},
			{"M","→Ab","→ε","→ε","→Ab",""},
			{"A","→aM","","","→ε",""}};
	String vt_tou_4[]={"","a","b","#"};
	String shuju_4[][]= {{"S","","→bN",""},
			{"N","→BaN","","→ε"},
			{"B","→ab","",""}};
	String vt_tou_5[]={"","a","b","c","d","e","f","o","#"};
	String shuju_5[][]= {{"S","→a","→MH","→MH","→MH","","","",""},
			{"H","","","","","→LSo","→ε","→ε","→ε"},
			{"K","","","→c","→dML","","","",""},
			{"L","","","","","→eHf","","",""},
			{"M","","→bLM","→K","→K","","","",""}};
	
	public ForecastPage()
	{
		//初始化界面
		init();
	}
	
	public void init()
	{
		//icon
		ImageIcon icon = new ImageIcon("images/1a.png");
		this.setIconImage(icon.getImage());
		this.setTitle("综合语法分析软件的设计与实现");
		//背景panel
		jp1 = new NewPanelfore2();
		jp1.setBounds(0, 0, 1000, 700);
		jp1.setLayout(null);
		//jrb1所在jpanel
		
		jrb1 = new JRadioButton("G[S]:   S→AT");
		jrb1.setBounds(70,30, 125,30);
		jrb1.setFont(new Font(null, 1, 15));
		jrb1.setOpaque(false);
		ja1 = new JLabel("A→BU");
		ja2 = new JLabel("T→+AT|ε");
		ja3 = new JLabel("U→*BU|ε");
		ja4 = new JLabel("B→(S)|m");
		ja1.setBounds(90, 70, 85, 25);
		ja2.setBounds(90, 105, 85, 25);
		ja3.setBounds(90, 140, 85, 25);
		ja4.setBounds(90, 175, 85, 25);
		ja1.setFont(new Font(null, 1, 15));
		ja2.setFont(new Font(null, 1, 15));
		ja3.setFont(new Font(null, 1, 15));
		ja4.setFont(new Font(null, 1, 15));
		jp1.add(jrb1);
		jp1.add(ja1);
		jp1.add(ja2);
		jp1.add(ja3);
		jp1.add(ja4);
		//jrb2所在jpanel
		
		jrb2 = new JRadioButton("G[E]:   E→TH");
		jrb2.setBounds(250,30, 125,30);
		jrb2.setFont(new Font(null, 1, 15));
		jrb2.setOpaque(false);
		jb1 = new JLabel("H→+TH|ε");
		jb2 = new JLabel("T→FL");
		jb3 = new JLabel("L→*FL|ε");
		jb4 = new JLabel("F→i|(E)");
		jb1.setBounds(270, 70, 85, 25);
		jb2.setBounds(270, 105, 85, 25);
		jb3.setBounds(270, 140, 85, 25);
		jb4.setBounds(270, 175, 85, 25);
		jb1.setFont(new Font(null, 1, 15));
		jb2.setFont(new Font(null, 1, 15));
		jb3.setFont(new Font(null, 1, 15));
		jb4.setFont(new Font(null, 1, 15));
		jp1.add(jrb2);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jb4);
		//jrb3所在jpanel
		
		
		jrb3 = new JRadioButton("G[S]:   S→aH");
		jrb3.setBounds(430,30, 125,30);
		jrb3.setFont(new Font(null, 1, 15));
		jrb3.setOpaque(false);
		jc1 = new JLabel("H→aMd|d");
		jc2 = new JLabel("M→Ab|ε");
		jc3 = new JLabel("A→aM|e");
		jc1.setBounds(450, 70, 85, 25);
		jc2.setBounds(450, 105, 85, 25);
		jc3.setBounds(450, 140, 85, 25);
		jc1.setFont(new Font(null, 1, 15));
		jc2.setFont(new Font(null, 1, 15));
		jc3.setFont(new Font(null, 1, 15));
		jp1.add(jrb3);
		jp1.add(jc1);
		jp1.add(jc2);
		jp1.add(jc3);
		
		
		jrb4 = new JRadioButton("G[S]:   S→bN");
		jrb4.setBounds(610,30, 125,30);
		jrb4.setFont(new Font(null, 1, 15));
		jrb4.setOpaque(false);
		jd1 = new JLabel("N→BaN|ε");
		jd2 = new JLabel("B→ab");
		jd1.setBounds(630, 70, 85, 25);
		jd2.setBounds(630, 105, 85, 25);
		jd1.setFont(new Font(null, 1, 15));
		jd2.setFont(new Font(null, 1, 15));
		jp1.add(jrb4);
		jp1.add(jd1);
		jp1.add(jd2);
		
		jrb5 = new JRadioButton("G[S]:   S→MH|a");
		jrb5.setBounds(790,30, 155,30);
		jrb5.setFont(new Font(null, 1, 15));
		jrb5.setOpaque(false);
		je1 = new JLabel("H→LSo|ε");
		je2 = new JLabel("K→dML|c");
		je3 = new JLabel("L→eHf");
		je4 = new JLabel("M→K|bLM");
		je1.setBounds(810, 70, 85, 25);
		je2.setBounds(810, 105, 85, 25);
		je3.setBounds(810, 140, 85, 25);
		je4.setBounds(810, 175, 85, 25);
		je1.setFont(new Font(null, 1, 15));
		je2.setFont(new Font(null, 1, 15));
		je3.setFont(new Font(null, 1, 15));
		je4.setFont(new Font(null, 1, 15));
		jp1.add(jrb5);
		jp1.add(je1);
		jp1.add(je2);
		jp1.add(je3);
		jp1.add(je4);
		
		
		jrb1.addActionListener(this);
		jrb2.addActionListener(this);
		jrb3.addActionListener(this);
		jrb4.addActionListener(this);
		jrb5.addActionListener(this);
		group = new ButtonGroup();
		group.add(jrb1);
		group.add(jrb2);
		group.add(jrb3);
		group.add(jrb4);
		group.add(jrb5);
		//中间紫色jpanel背景
		
		
		
		jl5 = new JLabel("Please enter a string to be analysed(end of '#'):");
		jl5.setFont(new Font("arial", 1, 20));
		jl5.setBounds(420, 250, 500, 25);
		//输入文本框
		jtf = new JTextField();
		jtf.setBounds(420, 285, 250, 25);
		jtf.setFont(new Font(null, 0, 20));
		jtf.setOpaque(false);
		jtf.addKeyListener(new KeyAdapter() {
		public void keyPressed(KeyEvent e)
		{
			if(e.getKeyCode()==KeyEvent.VK_ENTER)
				analysis();
		}
		});
		//输入按钮，清空按钮
		jbut1 = new JButton("enter");
		jbut2 = new JButton("clear");
		jbut1.setBounds(672, 285, 70, 25);
		jbut2.setBounds(752, 285, 70, 25);
		jbut1.setContentAreaFilled(false);
		jbut1.setOpaque(false);
		jbut2.setContentAreaFilled(false);
		jbut2.setOpaque(false);
		jbut1.addActionListener(this);
		jbut2.addActionListener(this);
		//结果文本区
		jta = new JTextArea();
		jta.setFont(new Font(null, 0, 20));
		//jta.setBorder(javax.swing.BorderFactory.createLineBorder(Color.white));
		JScrollPane jscroll = new JScrollPane(jta);
		jscroll.setBounds(420, 320, 410, 155);
		jta.setOpaque(false);
		jscroll.setOpaque(false);
		jscroll.getViewport().setOpaque(false);
		//返回语法分析页按钮，切换成英文界面按钮
		jbut3 = new JButton();//"返回"
		jbut4 = new JButton();//"英文"
		jbut3.setBounds(223, 379, 78, 35);
		jbut4.setBounds(123, 378, 78, 35);
		jbut3.setBorderPainted(false);
		jbut3.setOpaque(false);
		jbut3.setContentAreaFilled(false);
		jbut4.setBorderPainted(false);
		jbut4.setOpaque(false);
		jbut4.setContentAreaFilled(false);
		jbut3.addActionListener(this);
		jbut4.addActionListener(this);
		jl1 = new JLabel("Forecast");
		jl4 = new JLabel("analysis");
		jl2 = new JLabel("return");
		jl3 = new JLabel("in Chinese");
		jl1.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		jl2.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		jl3.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		jl1.setFont(new Font("arial", 1, 50));
		jl4.setFont(new Font("arial", 1, 50));
		jl2.setFont(new Font("arial", 1, 20));
		jl3.setFont(new Font("arial", 1, 15));
		jl1.setBounds(50, 230, 300, 100);
		jl4.setBounds(200, 270, 300, 100);
		jl2.setBounds(223, 379, 78, 35);
		jl3.setBounds(123, 378, 78, 35);
		jl1.setForeground(Color.white);
		jl2.setForeground(Color.white);
		jl3.setForeground(Color.white);
		jl4.setForeground(Color.white);
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl3);
		jp1.add(jl4);
		
		jp1.add(jbut3);
		jp1.add(jbut4);
		
		jp1.add(jl5);
		jp1.add(jtf);
		jp1.add(jbut1);
		jp1.add(jbut2);
		jp1.add(jscroll);
		
		
		//生成分析表按钮
		button = new MyButton2();
		button.setBorderPainted(false);
		button.setBounds(10,30, 210, 110);
		button.addActionListener(this);
		
		jp2 = new JPanel();
		jp2.setLayout(null);
		jp2.setBounds(100, 500, 230, 150);
		jp2.setOpaque(false);
		jp2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Click-to-Generate", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("arial", 1, 20), new java.awt.Color(0, 0, 0)));
		jp2.add(button);
		jp1.add(jp2);
		
		jl6 = new JLabel("Forecast analysis table");
		jl6.setBounds(550, 500, 300, 25);
		jl6.setFont(new Font("arial", 1, 20));
		//分析表
		jt = new JTable();
		jt.setBounds(410, 525, 500, 120);
		
		jp1.add(jt);
		jp1.add(jl6);
		
		
		
		
		
		this.add(jp1);
		this.setLayout(null);
		this.setBounds(180, 20, 1000, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}
	
	public static void main(String[] args)
	{
		new ForecastPage();
	}
	//预测分析程序
	public void analysis()
	{
		if(flag!=0)
		{
			jta.setText("");
			String s = jtf.getText();
			if(s.equals(""))
			{
				JOptionPane.showMessageDialog(null,"Please enter a string to be analysed!");
				return;
			}
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==' ')
				{
					JOptionPane.showMessageDialog(null,"String please don't add Spaces!");
					return;
				}
			}
			if(s.charAt(s.length()-1)!='#')
			{
				jta.setText("");
				JOptionPane.showMessageDialog(null,"Please end with '#'!");
				return;
			}
			char zifu[] = new char[100];//余串
			char fenxi[] = new char[100];//先进后出栈
			
			fenxi[1] = shuju[0][0].charAt(0);
			fenxi[0] = '#';
			int fzifu = 0;
			int ffenxi = 2;
			for(int i=s.length()-1;i>=0;i--)
			{
				zifu[fzifu] = s.charAt(i);
				fzifu++;
			}
			int buzhou = 2;
			char n[] = {'S','t','e','p',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',
						'S','t','a','c','k',' ',' ',' ',' ',' ',' ',' ',' ',' ',
						'S','t','r','i','n','g',' ',' ',' ',' ',' ',' ',' ',' ',
						' ',' ',' ',' ',' ','R','u','l','e',' ',' ',' ',' ',' '};
			jta.append(String.copyValueOf(n)+"\n");
			
			n = new char[40];
			n[0] = '1';
			//n[11] = 'S';
			n[11] = shuju[0][0].charAt(0);
			n[10] = '#';
			int u = 20;
			for(int i=fzifu-1;i>=0;i--)
			{
				n[u]=zifu[i];
				u++;
			}
				while(!(fenxi[ffenxi-1]=='#'&&zifu[fzifu-1]=='#'))
				{
					int i,j;
					char t = zifu[fzifu-1];
					char k = fenxi[ffenxi-1];
					if(t==k)
					{
						n[30] = k;
						n[32] = 'm';
						n[33] = 'a';
						n[34] = 't';
						n[35] = 'c';
						n[36] = 'h';
						
						jta.append(String.copyValueOf(n)+"\n");
						n = new char[40];
						fzifu--;
						ffenxi--;
						if(buzhou<10)
							n[0]=(char)('0'+buzhou);
						else
						{
							n[0] = (char)('0'+buzhou/10);
							n[1] = (char)('0'+buzhou%10);
						}
						u=10;
						for(int y=0;y<ffenxi;y++)
						{
							n[u] = fenxi[y];
							u++;
						}
						u = 20;
						for(int y=fzifu-1;y>=0;y--)
						{
							n[u] = zifu[y];
							u++;
						}
						buzhou++;
						continue;
					}
					
					for(i=0;i<shuju.length;i++)
					{
						if(shuju[i][0].equals(String.valueOf(k))) break;
					}
					for(j=0;j<vt_tou.length;j++)
					{
						if(vt_tou[j].equals(String.valueOf(t))) break;
						
					}
					if(j>=vt_tou.length)
					{
						n[30] = 'e';
						n[31] = 'r';
						n[32] = 'r';
						n[33] = 'o';
						n[34] = 'r';
						jta.append(String.copyValueOf(n));
						jta.append("\n"+"The string was not the grammar's sentences"+"\n");
						//JOptionPane.showMessageDialog(null,"Failed!!!  The string was not the grammar's sentences!");
						
						return;
					}
					if(i>=shuju.length)
					{
						n[30] = 'e';
						n[31] = 'r';
						n[32] = 'r';
						n[33] = 'o';
						n[34] = 'r';
						jta.append(String.copyValueOf(n));
						//	JOptionPane.showMessageDialog(null,"分析失败！！  该串不是该文法的句子!");
						jta.append("\n"+"该串不是该文法的句子"+"\n");
						return;
					}

					String result1 = shuju[i][j];
					if(result1.equals(""))
					{
						n[30] = 'e';
						n[31] = 'r';
						n[32] = 'r';
						n[33] = 'o';
						n[34] = 'r';
						jta.append(String.copyValueOf(n));
						jta.append("\n"+"The string was not the grammar's sentences"+"\n");
						//JOptionPane.showMessageDialog(null,"Failed!!!   The string was not the grammar's sentences!");
						return;
					}
					
					else
					{
						n[30]=shuju[i][0].charAt(0);
						u = 31;
						String result = result1;
						for(int y=0;y<result.length();y++)
						{
							n[u] = result.charAt(y);
							u++;
						}
						jta.append(String.copyValueOf(n)+"\n");
						n = new char[40];
						
						ffenxi--;
						if(result.charAt(1)!='ε')
						{
							for(i=result.length()-1;i>0;i--)
							{

								fenxi[ffenxi] = result.charAt(i);
								ffenxi++;
							}
						}
						
					}
					if(buzhou<10)
						n[0] = (char)('0'+buzhou);
					else
					{
						n[0] = (char)('0'+buzhou/10);
						n[1] = (char)('0'+buzhou%10);
					}
					u = 10;
					for(int y=0;y<ffenxi;y++)
					{
						n[u] = fenxi[y];
						u++;
					}
					u = 20;
					for(int y=fzifu-1;y>=0;y--)
					{
						n[u]=zifu[y];
						u++;
					}
					buzhou++;
				}
				buzhou--;
				n = new char[40];
				n[0] = (char)('0'+buzhou/10);
				n[1] = (char)('0'+buzhou%10);
				n[10] = '#';
				n[20] = '#';
				n[30] = 'a';
				n[31] = 'c';
				n[32] = 'c';
				n[33] = 'e';
				n[34] = 'p';
				n[35] = 't';
				//n[36] = 's';
				jta.append(String.copyValueOf(n));
				jta.append("\n"+"The string is the grammar's sentences"+"\n");
				//JOptionPane.showMessageDialog(null,"Success!!!  The string is the grammar's sentences!");
				return;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Please select a grammar!");
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//文法一
		if(jrb1.isSelected())
		{
			flag = 1;
			vt_tou=vt_tou_1;
			shuju=shuju_1;
		}
		//文法二
		if(jrb2.isSelected())
		{
			flag = 2;
			vt_tou=vt_tou_2;
			shuju=shuju_2;
		}
		//文法三
		if(jrb3.isSelected())
		{
			flag = 3;
			vt_tou=vt_tou_3;
			shuju=shuju_3;
		}
		//文法四
		if(jrb4.isSelected())
		{
			flag = 4;
			vt_tou=vt_tou_4;
			shuju=shuju_4;
		}
		//文法五
		if(jrb5.isSelected())
		{
			flag = 5;
			vt_tou=vt_tou_5;
			shuju=shuju_5;
		}
		//生成分析表按钮
		if(e.getSource()==button)
		{
			if(flag!=0)
			{
				jt = new JTable(shuju,vt_tou);
				JScrollPane jtable1 = new JScrollPane(jt);
				jtable1.setBackground(new Color(Integer.parseInt("DBDBFF", 16)));
				this.getContentPane().add(jtable1);
				jtable1.setBounds(410, 525, 500, 120);
				jp1.add(jtable1);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"请选择文法!");
			}
		}
		//输入按钮
		if(e.getSource()==jbut1)
		{
			analysis();
		}
		//清空按钮
		if(e.getSource()==jbut2)
		{
			jtf.setText("");
		}
		//返回语法分析页面按钮
		if(e.getSource()==jbut3)
		{
			new Secondpage();
			this.setVisible(false);
		}
		//切换成英文界面按钮
		if(e.getSource()==jbut4)
		{
			new Forecast();
			this.setVisible(false);
		}
	}
}

class NewPanelfore2 extends JPanel
{
	/**
	 * @author CRR
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g)
	{
		ImageIcon icon = new ImageIcon("images/03.png");
		g.drawImage(icon.getImage(), 0, 0, getSize().width, getSize().height, this);
	}
}

class MyButton2 extends JButton
{
	/**
	 * @author CRR
	 */
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g)
	{
		Toolkit tool = Toolkit.getDefaultToolkit();
		Image img = tool.getImage(Forecast.class.getResource("/utils/5-gif-img.gif"));
		g.drawImage(img, 0, 0, getSize().width, getSize().height, null);
		super.paintComponents(g);
	}
}