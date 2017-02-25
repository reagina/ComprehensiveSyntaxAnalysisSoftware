package page2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
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

public class OperatorPage extends JFrame implements ActionListener{
	/**
	 * @author CRR
	 */
	private static final long serialVersionUID = 1L;
	NewPaneloper22 jp1;
	JPanel jp2;
	JButton jb1,jb2,jb3,jb4,jb5;
	JLabel jl1,ja1,ja2,ja3,ja4,ja5;
	JLabel ja,jb,jc,jd;
	JTable jt;
	JTextArea jta;
	JTextField jtf;
	JRadioButton jrb1,jrb2,jrb3,jrb4,jrb5;
	ButtonGroup group;
	
	int flag = 0;
	String vt_tou[] = {};
	String shuju[][]={};
	String vt_tou_1[]={"","+","*","/","(",")","i","#"};
	String shuju_1[][]= {{"+",">","<","<","<",">","<",">"},
		{"*",">",">","<","<",">","<",">"},
		{"/",">",">","<","<",">","<",">"},
		{"(","<","<","<","<","=","<",""},
		{")",">",">",">","",">","",">"},
		{"i",">",">",">","",">","",">"},
		{"#","<","<","<","<","","<","="}};
	String vt_tou_2[]={"",";","(",")","a","+","#"};
	String shuju_2[][]= {{";",">","<",">","<",">",">"},
			{"(","<","<","=","<","<",""},
			{")",">",">",">","",">",">"},
			{"a",">",">",">","",">",">"},
			{"+","<","<",">","<",">",""},
			{"#","<","<","","<","","="}};
	String vt_tou_3[]={"","o","a","n","(",")","t","f","#"};
	String shuju_3[][]= {{"o",">","<","<","<",">","<","<",">"},
			{"a",">",">","<","<",">","<","<",">"},
			{"n",">",">","<","<",">","<","<",">"},
			{"(","<","<","<","<","=","<","<",""},
			{")",">",">","","",">","","",">"},
			{"t",">",">","","",">","","",">"},
			{"f",">",">","","",">","","",">"},
			{"#","<","<","<","<","","<","<","="}};
	String vt_tou_4[]={"","a","b","d","m","e","f","#"};
	String shuju_4[][]= {{"a",">","<","<","<","<",">",">"},
			{"b",">",">","<","<","<",">",">"},
			{"d",">",">","<","<","<",">",">"},
			{"m",">",">",">","","",">",">"},
			{"e","<","<","<","<","<","=",""},
			{"f",">",">",">","","",">",">"},
			{"#","<","<","<","<","<","","="}};
	String vt_tou_5[]={"","a","^","(",",",")","#"};
	String shuju_5[][]= {{"a","","","",">",">",">"},
		{"^","","","",">",">",">"},
		{"(","<","<","<","<","=",""},
		{",","<","<","<",">",">",""},
		{")","","","",">",">",">"},
		{"#","<","<","<","","","="}};
	
	public OperatorPage()
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
		//地图jpanel
		jp1 = new NewPaneloper22();
		jp1.setLayout(null);
		jp1.setBounds(0, 0, 1000, 700);
		
		ja = new JLabel("Operator pr");
		jb = new JLabel("iority analysis");
		jc = new JLabel("return");
		jd = new JLabel("in Chinese");
		ja.setBounds(5, 10, 340, 73);
		jb.setBounds(300, 10, 400, 73);
		jc.setBounds(153, 107, 148, 73);
		jd.setBounds(0, 107, 148, 73);
		ja.setForeground(Color.white);
		jb.setForeground(new Color(108, 197, 232));
		jc.setForeground(Color.white);
		jd.setForeground(Color.white);
		ja.setFont(new Font("arial", 1, 53));
		jb.setFont(new Font("arial", 1, 53));
		jc.setFont(new Font("arial", 0, 30));
		jd.setFont(new Font("arial", 0, 27));
		//ja.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		jc.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		jd.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		jp1.add(ja);
		jp1.add(jb);
		jp1.add(jc);
		jp1.add(jd);
		
		
		jrb1 = new JRadioButton("1、G[E]:E'→#E#    E→E+T|T    ");
		jrb2 = new JRadioButton("2、G[S]:S'→#S#    S→S;D|D    ");
		jrb3 = new JRadioButton("3、G[B]:B'→#B#    B→BoT|T    ");
		jrb4 = new JRadioButton("4、G[S]:S'→#S#    S→SaM|M    ");
		jrb5 = new JRadioButton("5、G[S]:S'→#S#    S→a|^|(T)    ");
		ja1 = new JLabel("T→T*F|F    F→P/F|P    P→(E)|i");
		ja2 = new JLabel("D→D(T)|H    H→a|(S)    T→T+S|S");
		ja3 = new JLabel("T→TaF|F    F→nF|(B)|t|f ");
		ja4 = new JLabel("M→MbB|B    B→DdB|D    D→eSf|m");
		ja5 = new JLabel("T→T,S|S");
		jrb1.setBounds(10, 220, 300, 25);
		jrb2.setBounds(10, 300, 300, 25);
		jrb3.setBounds(10, 400, 300, 25);
		jrb4.setBounds(10, 500, 300, 25);
		jrb5.setBounds(10, 600, 300, 25);
		ja1.setBounds(30, 250, 300, 25);
		ja2.setBounds(30, 330, 300, 25);
		ja3.setBounds(30, 430, 300, 25);
		ja4.setBounds(30, 530, 300, 25);
		ja5.setBounds(30, 630, 300, 25);
		ja1.setFont(new Font(null, 1, 16));
		ja2.setFont(new Font(null, 1, 16));
		ja3.setFont(new Font(null, 1, 16));
		ja4.setFont(new Font(null, 1, 16));
		ja5.setFont(new Font(null, 1, 16));

		jrb1.setFont(new Font(null, 1, 16));
		jrb2.setFont(new Font(null, 1, 16));
		jrb3.setFont(new Font(null, 1, 16));
		jrb4.setFont(new Font(null, 1, 16));
		jrb5.setFont(new Font(null, 1, 16));
		jrb1.setForeground(Color.white);
		jrb2.setForeground(Color.white);
		jrb3.setForeground(Color.white);
		jrb4.setForeground(Color.white);
		jrb5.setForeground(Color.white);
		ja1.setForeground(Color.white);
		ja2.setForeground(Color.white);
		ja3.setForeground(Color.white);
		ja4.setForeground(Color.white);
		ja5.setForeground(Color.white);
		
		jrb1.setOpaque(false);
		jrb2.setOpaque(false);
		jrb3.setOpaque(false);
		jrb4.setOpaque(false);
		jrb5.setOpaque(false);
		
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
		jp1.add(jrb1);
		jp1.add(jrb2);
		jp1.add(jrb3);
		jp1.add(jrb4);
		jp1.add(jrb5);
		jp1.add(ja1);
		jp1.add(ja2);
		jp1.add(ja3);
		jp1.add(ja4);
		jp1.add(ja5);
		//返回语法分析页面按钮，切换成英文界面按钮
		jb4 = new JButton();//"返回"
		jb5 = new JButton();//"英文"
		jb4.setBounds(153, 107, 148, 73);
		jb5.setBounds(0, 107, 148, 73);
		jb4.setContentAreaFilled(false);
		jb5.setContentAreaFilled(false);
		jb4.setOpaque(false);
		jb5.setOpaque(false);
		jb4.setBorderPainted(false);
		jb5.setBorderPainted(false);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jp1.add(jb4);
		jp1.add(jb5);
		
		
		
		
		jl1 = new JLabel("Please enter a string to be analysed(end of '#'):");
		jl1.setBounds(320, 120, 500, 25);
		jl1.setFont(new Font("arial", 1, 20));
		jl1.setForeground(Color.white);
		jp1.add(jl1);
		//输入文本框
		jtf = new JTextField();
		jtf.setBounds(320, 150, 250, 25);
		jtf.setOpaque(false);
		//jtf.setForeground(new Color(Integer.parseInt("cdb38b",16)));
		jtf.setFont(new Font(null, 0, 20));
		jtf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
					analysis();
			}
		});
		jtf.setBorder(javax.swing.BorderFactory.createLineBorder(Color.white));
		jp1.add(jtf);
		//输入按钮，清空按钮
		jb2 = new JButton("enter");
		jb3 = new JButton("clear");
		jb2.setBounds(580, 150, 60, 25);
		jb3.setBounds(650, 150, 60, 25);
		//jb2.setBorderPainted(false);
		jb2.setOpaque(false);
		jb2.setContentAreaFilled(false);
		jb2.setForeground(Color.white);
		//jb3.setBorderPainted(false);
		jb3.setOpaque(false);
		jb3.setContentAreaFilled(false);
		jb3.setForeground(Color.white);
		jb2.setBorder(javax.swing.BorderFactory.createLineBorder(Color.white));
		jb3.setBorder(javax.swing.BorderFactory.createLineBorder(Color.white));
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jp1.add(jb2);
		jp1.add(jb3);
		//结果文本框
		jta = new JTextArea();
		//jta.setForeground(new Color(Integer.parseInt("cdb38b",16)));
		jta.setFont(new Font(null, 0, 20));
		JScrollPane jscroll = new JScrollPane(jta);
		jscroll.setBounds(320, 180, 545, 210);
		jta.setOpaque(false);
		jscroll.setOpaque(false);
		jscroll.getViewport().setOpaque(false);
		jscroll.setBorder(javax.swing.BorderFactory.createLineBorder(Color.white));
		jp1.add(jscroll);
		
		//生成分析表按钮
		jb1 = new JButton("Generate analysis table");
		//jb1.setForeground(Color.white);
		jb1.setBounds(95, 210, 350, 30);
		jb1.setFont(new Font(null, 1, 25));
		jb1.setContentAreaFilled(false);
		jb1.setOpaque(false);
		//jb1.setBorderPainted(false);
		jb1.addActionListener(this);
		//jp1.add(jb1);
		//分析表
		jt = new JTable();
		jt.setBounds(50, 40, 440, 160);
		//jt.setOpaque(false);
		//jp1.add(jt);
		jp2 = new JPanel();
		jp2.setLayout(null);
		jp2.setBounds(320, 410, 545, 260);
		jp2.setOpaque(false);
		jp2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Operator priority analysis table", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("arial", 1, 20), new java.awt.Color(255, 255, 255)));
		jp2.add(jt);
		jp2.add(jb1);
		jp1.add(jp2);
		
		jp1.setLayout(null);
		this.add(jp1);
		this.setLayout(null);
		this.setBounds(180, 20, 1000, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}
	
	public static void main(String[] args)
	{
		new OperatorPage();
	}
	
	//算符优先分析程序
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
			int index[] = new int[100];//存放符号栈中最后一个小于元素在符号栈中的索引
			char zifu[] = new char[100];//余串
			char fenxi[] = new char[100];//符号栈S
			fenxi[0] = '#';
			int findex=0;
			int fzifu = 0;
			int ffenxi = 1;
			for(int i=s.length()-1;i>=0;i--)
			{
				zifu[fzifu] = s.charAt(i);
				fzifu++;
			}
			int buzhou = 2;
			char n[] = {'S','t','e','p',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',
						'S','t','a','c','k',' ',' ',' ',' ',' ',' ',' ',' ',' ',
						'R','e','l','a','t','i','o','n',' ',' ',' ',' ',' ',' ',
						'S','t','r','i','n','g',' ',' ',' ',' ',' ',' ',' ',' ',
						'A','c','t','i','o','n',' ',' ',' ',' ',' ',' ',' ',' '};
			jta.append(String.copyValueOf(n)+"\n");
		
			n = new char[50];
			
			n[0] = '1';
			n[10] = '#';
			int u = 30;
			for(int i=fzifu-1;i>=0;i--)
			{
				n[u]=zifu[i];
				u++;
			}
			char t;
			char k;
			
			while(true)
			{
				t=zifu[fzifu-1];//t为余串第一个字符
				//分析栈的栈顶是非终结符，则k为栈顶的下一个字符，否则k的值为栈顶元素
				if(fenxi[ffenxi-1]>'A'&&fenxi[ffenxi-1]<'Z'&& ffenxi-2>=0)
				{
					k = fenxi[ffenxi-2];
				}
				else{
					k = fenxi[ffenxi-1];
				}
				
				while(!(k=='#' && t=='#'))
				{
					int i,j;
					//扫描分析栈顶的终结符
					for(i=0;i<shuju.length;i++)
					{
						if(shuju[i][0].equals(String.valueOf(k))) break;
					}
					//扫描余串首字符的非终结符
					for(j=0;j<vt_tou.length;j++)
					{
						if(vt_tou[j].equals(String.valueOf(t))) break;
					}
					if(j>=vt_tou.length)
					{
						n[40] = 'e';
						n[41] = 'r';
						n[42] = 'r';
						n[43] = 'o';
						n[44] = 'r';
						jta.append(String.copyValueOf(n));
						jta.append("\n"+"The string was not the grammar's sentences"+"\n");
						//JOptionPane.showMessageDialog(null,"Failed!!!  The string was not the grammar's sentences!");
						return;
					}
					String result1 = shuju[i][j];
					if(result1.equals(""))
					{
						n[40] = 'e';
						n[41] = 'r';
						n[42] = 'r';
						n[43] = 'o';
						n[44] = 'r';
						jta.append(String.copyValueOf(n));
						jta.append("\n"+"The string was not the grammar's sentences"+"\n");
						//JOptionPane.showMessageDialog(null,"Failed!!!  The string was not the grammar's sentences!");
						return;
					}
					else
					{
						//查表非空，分析优先符号
						n[20]=result1.charAt(0);
						
						if(result1.charAt(0)=='<')
						{
							index[findex]=ffenxi;//记住最近小于符号处栈顶的索引
							findex++;
							ffenxi++;
							fenxi[ffenxi-1] = zifu[fzifu-1];//余串首字符入分析栈
							fzifu--;//余串首字符出栈
							n[40]='p';
							n[41]='u';
							n[42]='s';
							n[43]='h';
						}
						if(result1.charAt(0)=='=')
						{
							ffenxi++;
							fenxi[ffenxi-1] = zifu[fzifu-1];//余串首字符入分析栈
							fzifu--;//余串首字符出栈
							n[40]='p';
							n[41]='u';
							n[42]='s';
							n[43]='h';
						}
						if(result1.charAt(0)=='>')
						{
							ffenxi=index[findex-1];//将分析栈的索引改为最近一个小于状态时索引
							if(fenxi[ffenxi-1]>'A'&&fenxi[ffenxi-1]<'Z')//如果改后索引处的值为非终结符，则再向前一个索引
							{
								ffenxi--;
							}
							fenxi[ffenxi]='N';//将最近一个小于处的终结符及其后面的字符统一置为一个‘N’
							ffenxi++;
							findex--;//将记录‘最近一个小于处索引’的数组的索引减一
							n[40]='s';
							n[41]='t';
							n[42]='a';
							n[43]='t';
							n[44]='u';
							n[45]='t';
							n[46]='e';
						}
						jta.append(String.copyValueOf(n)+"\n");
						n = new char[50];
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
						u = 30;
						for(int y=fzifu-1;y>=0;y--)
						{
							n[u] = zifu[y];
							u++;
						}
						buzhou++;
						break;
					}
				}
				if(k=='#' && t=='#')
				{
					n[20] = '=';
					
					n[40] = 's';
					n[41] = 'u';
					n[42] = 'c';
					n[43] = 'c';
					n[44] = 'e';
					n[45] = 's';
					n[46] = 's';
					jta.append(String.copyValueOf(n));
					jta.append("\n"+"The string is the grammar's sentences"+"\n");
					//JOptionPane.showMessageDialog(null,"Success!!!  The string is the grammar's sentences!");
					return;
				}
			}
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
		if(e.getSource()==jb1)
		{
			if(flag!=0)
			{
				jt = new JTable(shuju,vt_tou);
				JScrollPane jtable1 = new JScrollPane(jt);
				jtable1.setBackground(new Color(Integer.parseInt("DBDBFF", 16)));
				this.getContentPane().add(jtable1);
				jtable1.setBounds(50, 40, 440, 160);
				jp2.add(jtable1);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"请选择文法!");
			}
			
		}
		//输入按钮
		if(e.getSource()==jb2)
		{
			analysis();
		}
		//清空按钮
		if(e.getSource()==jb3)
		{
			jtf.setText("");
		}
		//返回语法分析页面按钮
		if(e.getSource()==jb4)
		{
			new Secondpage();
			this.setVisible(false);
		}
		//切换成英文界面按钮
		if(e.getSource()==jb5)
		{
			new Operator();
			this.setVisible(false);
		}
	}
}

class NewPaneloper22 extends JPanel
{
	/**
	 * @author CRR
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g)
	{
		ImageIcon icon = new ImageIcon("images/04.png");
		g.drawImage(icon.getImage(), 0, 0, getSize().width, getSize().height, this);
	}
}

