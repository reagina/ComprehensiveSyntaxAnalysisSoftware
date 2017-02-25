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

public class LRpage extends JFrame implements ActionListener{
	/**
	 * @author CRR
	 */
	private static final long serialVersionUID = 1L;
	NewPanellr22 jp1;
	JPanel jp2;
	JLabel jl1,jl2,jl11,jl12,jl21,jl22,jl31,jl32,jl41,jl42;
	JLabel ja,jb,jc,jd;
	JButton jb1,jb2,jb3,jb4,jb5;
	JTextArea jta;
	JTextField jtf;
	JTable jt1,jt2;
	JRadioButton jrb1,jrb2,jrb3,jrb4;
	ButtonGroup group;
	
	int flag = 0;
	String gototable[]={};
	String shuju_g[][]={};
	String action[]={};
	String shuju_a[][]={};
	String[] rule={};
	String action_1[]={"","a","b","c","d","#"};
	String shuju_a_1[][]= {{"0","s2","s3","","",""},
		{"1","","","","","acc"},
		{"2","","","s4","s10",""},
		{"3","","","s5","s11",""},
		{"4","","","s4","s10",""},
		{"5","","","s5","s11",""},
		{"6","r1","r1","r1","r1","r1"},
		{"7","r2","r2","r2","r2","r2"},
		{"8","r3","r3","r3","r3","r3"},
		{"9","r5","r5","r5","r5","r5"},
		{"10","r4","r4","r4","r4","r4"},
		{"11","r6","r6","r6","r6","r6"}};
	String action_2[]={"","i","+","*","(",")","#"};
	String shuju_a_2[][]= {{"0","s5","","","s4","",""},
			{"1","","s6","","","","acc"},
			{"2","","r2","s7","","r2","r2"},
			{"3","","r4","r4","","r4","r4"},
			{"4","s5","","","s4","",""},
			{"5","","r6","r6","","r6","r6"},
			{"6","s5","","","s4","",""},
			{"7","s5","","","s4","",""},
			{"8","","s6","","","s11",""},
			{"9","","r1","s7","","r1","r1"},
			{"10","","r3","r3","","r3","r3"},
			{"11","","r5","r5","","r5","r5"}};
	String action_3[]={"","a","b","f","d","e","#"};
	String shuju_a_3[][]= {{"0","s2","s3","","","",""},
			{"1","","","","","","acc"},
			{"2","","","s6","","",""},
			{"3","","","s9","","",""},
			{"4","","","","s10","",""},
			{"5","","","","","s11",""},
			{"6","","","","r5","r6",""},
			{"7","","","","s12","",""},
			{"8","","","","","s13",""},
			{"9","","","","r6","r5",""},
			{"10","","","","","","r1"},
			{"11","","","","","","r3"},
			{"12","","","","","","r2"},
			{"13","","","","","","r4"}};
	String action_4[]={"","=","*","i","#"};
	String shuju_a_4[][]= {{"0","","s4","s5",""},
			{"1","","","","acc"},
			{"2","s6","","","r5"},
			{"3","","","","r2"},
			{"4","","s4","s5",""},
			{"5","r4","","","r4"},
			{"6","","s4","s5",""},
			{"7","r3","","","r3"},
			{"8","r5","","","r5"},
			{"9","","","","r1"}};
	String gototable_1[]={"","A","B","E"};
	String shuju_g_1[][]= {{"0","","","1"},
			{"1","","",""},
			{"2","6","",""},
			{"3","","7",""},
			{"4","8","",""},
			{"5","","9",""},
			{"6","","",""},
			{"7","","",""},
			{"8","","",""},
			{"9","","",""},
			{"10","","",""},
			{"11","","",""}};
	String gototable_2[]={"","E","T","F"};
	String shuju_g_2[][]= {{"0","1","2","3"},
			{"1","","",""},
			{"2","","",""},
			{"3","","",""},
			{"4","8","2","3"},
			{"5","","",""},
			{"6","","9","3"},
			{"7","","","10"},
			{"8","","",""},
			{"9","","",""},
			{"10","","",""},
			{"11","","",""}};
	String gototable_3[]={"","S","M","N"};
	String shuju_g_3[][]= {{"0","1","",""},
			{"1","","",""},
			{"2","","4","5"},
			{"3","","8","7"},
			{"4","","",""},
			{"5","","",""},
			{"6","","",""},
			{"7","","",""},
			{"8","","",""},
			{"9","","",""},
			{"10","","",""},
			{"11","","",""},
			{"12","","",""},
			{"13","","",""}};
	String gototable_4[]={"","S","L","R"};
	String shuju_g_4[][]= {{"0","1","2","3"},
			{"1","","",""},
			{"2","","",""},
			{"3","","",""},
			{"4","","8","7"},
			{"5","","",""},
			{"6","","8","9"},
			{"7","","",""},
			{"8","","",""},
			{"9","","",""}};
	String[] rule_1 ={"S'→E","E→aA","E→bB","A→cA","A→d","B→cB","B→d"};
	String[] rule_2 ={"S'→E","E→E+T","E→T","T→T*F","T→F","F→(E)","F→i"};
	String[] rule_3 ={"S'→S","S→aMd","S→bNd","S→aNe","S→bMe","M→f","N→f"};
	String[] rule_4 ={"S'→S","S→L=R","S→R","L→*R","L→i","R→L"};
	
	public LRpage()
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
		jp1 = new NewPanellr22();
		jp1.setBounds(0, 0, 1000, 700);
		jp1.setLayout(null);
		
		
		jl2 = new JLabel("Please enter a string to be analysed(end of '#'):");
		jl2.setBounds(340, 30, 550, 30);
		jl2.setFont(new Font("arial", 0, 25));
		jl2.setForeground(Color.white);
		jp1.add(jl2);
		//输入文本框
		jtf = new JTextField();
		jtf.setForeground(Color.black);
		jtf.setFont(new Font(null, 0, 20));
		jtf.setBounds(340, 60, 250, 25);
		//jtf.setOpaque(false);
		jtf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
					analysis();
			}
		});
		jp1.add(jtf);
		//输入按钮，清空按钮
		jb3 = new JButton("enter");
		jb4 = new JButton("clear");
		jb3.setBounds(600, 60, 70, 25);
		jp1.add(jb3);
		jb4.setBounds(680, 60, 70, 25);
		jb3.setContentAreaFilled(false);
		jb3.setBackground(getBackground());
		//jb3.setBorderPainted(false);
		jb4.setContentAreaFilled(false);
		jb4.setBackground(getBackground());
		//jb4.setBorderPainted(false);
		jb3.setForeground(Color.white);
		jb4.setForeground(Color.white);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jp1.add(jb4);
		//结果文本框
		jta = new JTextArea();
		jta.setOpaque(false);
		jta.setForeground(Color.black);
		jta.setFont(new Font(null, 0, 20));
		JScrollPane jscroll = new JScrollPane(jta);
		jscroll.setBounds(340, 90, 620, 160);
		jscroll.setOpaque(false);
		jscroll.getViewport().setOpaque(false);
		jp1.add(jscroll);
		
		
		jb5 = new JButton("Generate ");
		jb5.setBounds(340, 330, 200, 80);
		jb5.setForeground(Color.white);
		jb5.setFont(new Font("arial", 0, 25));
		jb5.setOpaque(false);
		jb5.setVerticalAlignment((int) BOTTOM_ALIGNMENT);
		jb5.setContentAreaFilled(false);
		//jb5.setBorderPainted(false);
		jb5.addActionListener(this);
		jd = new JLabel("analysis table");
		jd.setBounds(360, 280, 200, 200);
		jd.setForeground(Color.white);
		jd.setFont(new Font("arial", 0, 25));
		
		jp2 = new JPanel();
		jp2.setLayout(null);
		jp2.setBounds(340, 300, 200, 150);
		jp2.setOpaque(false);
		jp2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("宋体", 1, 20), new java.awt.Color(255, 255, 255)));
		jp1.add(jb5);
		jp1.add(jd);
		
		//分析表
		jt1 = new JTable();
		jt2 = new JTable();
		jt1.setBounds(550, 255, 200, 250);
		jt2.setBounds(750, 255, 200, 250);
		jt1.setOpaque(false);
		jt2.setOpaque(false);
		jp1.add(jt1);
		jp1.add(jt2);
		
		
		
		
		group = new ButtonGroup();
		jrb1 = new JRadioButton("G[S']:S'→E[0]  E→aA[1]  ");
		jrb2 = new JRadioButton("G[S']:S'→E[0]  E→E+T[1]  ");
		jrb3 = new JRadioButton("G[S']:S'→S[0]  S→aMd[1]   ");
		jrb4 = new JRadioButton("G[S']:S'→S[0]  S→L=R[1]    ");
		jrb1.setBounds(120, 65, 180,20);
		jrb2.setBounds(120, 175, 180,20);
		jrb3.setBounds(120, 280, 180,20);
		jrb4.setBounds(120, 390, 180,20);

		jrb1.setOpaque(false);
		jrb2.setOpaque(false);
		jrb3.setOpaque(false);
		jrb4.setOpaque(false);
		
		jrb1.addActionListener(this);
		jrb2.addActionListener(this);
		jrb3.addActionListener(this);
		jrb4.addActionListener(this);
		group.add(jrb1);
		group.add(jrb2);
		group.add(jrb3);
		group.add(jrb4);
		jl11 = new JLabel("E→bB[2]  A→cA[3]  A→d[4]");
		jl12 = new JLabel("B→cB[5]  B→d[6] ----LR(0)");
		jl21 = new JLabel("E→T[2]  T→T*F[3]  T→F[4]");
		jl22 = new JLabel("F→(E)[5]  F→i[6] ----SLR(1)");
		jl31 = new JLabel("S→bNd[2] S→aNe[3] S→bMe[4] ");
		jl32 = new JLabel("M→f[5]  N→f[6] ----LR(1)");
		jl41 = new JLabel("S→R[2]  L→*R[3]  L→i[4]");
		jl42 = new JLabel("R→L[5] ----LALR(1)");
		jl11.setBounds(122, 85, 170, 20);
		jl12.setBounds(122, 105, 170, 20);
		jl21.setBounds(122, 195, 170, 20);
		jl22.setBounds(122, 215, 170, 20);
		jl31.setBounds(122, 300, 190, 20);
		jl32.setBounds(122, 320, 170, 20);
		jl41.setBounds(122, 410, 170, 20);
		jl42.setBounds(122, 430, 170, 20);
		
		jp1.add(jl11);
		jp1.add(jl12);
		jp1.add(jl21);
		jp1.add(jl22);
		jp1.add(jl31);
		jp1.add(jl32);
		jp1.add(jl41);
		jp1.add(jl42);
		jp1.add(jrb1);
		jp1.add(jrb2);
		jp1.add(jrb3);
		jp1.add(jrb4);
		

		
		
		//返回语法分析页面按钮，切换成英文界面按钮
		jb1 = new JButton();//"返回"
		jb2 = new JButton();//"英文"
		jb1.setBounds(549, 610,92, 40);
		jb2.setBounds(391, 610,92, 40);
		jb1.setContentAreaFilled(false);
		jb1.setBorderPainted(false);
		jb2.setContentAreaFilled(false);
		jb2.setBorderPainted(false);
		jb1.setFont(new Font(null, 1, 20));
		jb2.setFont(new Font(null, 1, 20));
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jp1.add(jb1);
		jp1.add(jb2);
		ja = new JLabel("LR analysis");
		jb = new JLabel("return");
		jc = new JLabel("in Chinese");
		ja.setBounds(340, 500,400, 100);
		jb.setBounds(549, 610,92, 40);
		jc.setBounds(391, 610,92, 40);
		jp1.add(ja);
		jp1.add(jb);
		jp1.add(jc);
		ja.setFont(new Font("arial", 1, 60));
		jb.setFont(new Font("arial", 1, 20));
		jc.setFont(new Font("arial", 1, 17));
		ja.setForeground(new Color(108, 197, 232));
		jb.setForeground(Color.white);
		jc.setForeground(Color.white);
		jb.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		jc.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		
		this.add(jp1);
		this.setLayout(null);
		this.setBounds(180, 20, 1000, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}
	
	public static void main(String[] args)
	{
		new LRpage();
	}
	//LR分析程序
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
			String state_stack[] = new String[100];//状态栈
			char char_stack[] = new char[100];//符号栈
			state_stack[0] = "0";
			char_stack[0] = '#';
			int state_num = 1;
			int char_num = 1;
			int fzifu = 0;
			for(int i=s.length()-1;i>=0;i--)
			{
				zifu[fzifu] = s.charAt(i);
				fzifu++;
			}
			int buzhou = 2;
			char n[] = {'S','t','e','p',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',
					'S','t','a','t','e','_','S','t','a','c','k',' ',' ',' ',
					'C','h','a','r','_','S','t','a','c','k',' ',' ',' ',' ',
					'S','t','r','i','n','g',' ',' ',' ',' ',' ',' ',' ',' ',
					'A','c','t','i','o','n',' ',' ',' ',' ',' ',' ',' ',' ',
					'G','o','t','o',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
			jta.append(String.copyValueOf(n)+"\n");
	
			n = new char[70];
			
			n[0] = '1';
			n[10] = '0';
			n[25] = '#';
			int u = 35;
			for(int i=fzifu-1;i>=0;i--)
			{
				n[u]=zifu[i];
				u++;
			}
			while(true)
			{
				String k;
				char t = zifu[fzifu-1];//t 的值为余串中的第一个字符
				//如果状态栈的栈顶元素的第一个字符为左括号，则区括号里的值，否则区栈顶元素的值
				if(state_stack[state_num-1].charAt(0)=='(' )
				{
					k=state_stack[state_num-1].substring(1,state_stack[state_num-1].length()-1);
				}
				else
				{
					k=state_stack[state_num-1];
				}
				while(!(k=="1"&&t=='#'))
				{
					int i,j;
					//扫描状态值
					for(i=0;i<state_stack.length;i++)
					{
						if(shuju_a[i][0].equals(String.valueOf(k))) break;
					}
					//扫描余串首字符值
					for(j=0;j<action.length;j++)
					{
						if(action[j].equals(String.valueOf(t))) break;
						
					}
					if(j>=action.length)
					{
						n[45] = 'e';
						n[46] = 'r';
						n[47] = 'r';
						n[48] = 'o';
						n[49] = 'r';
						jta.append(String.copyValueOf(n));
						jta.append("\n"+"The string was not the grammar's sentences"+"\n");
						//JOptionPane.showMessageDialog(null,"Failed!!!  The string was not the grammar's sentences!");
						return;
					}

					String result1 = shuju_a[i][j];
					if(result1.equals(""))
					{
						n[45] = 'e';
						n[46] = 'r';
						n[47] = 'r';
						n[48] = 'o';
						n[49] = 'r';
						jta.append(String.copyValueOf(n));
						jta.append("\n"+"The string was not the grammar's sentences"+"\n");
						//JOptionPane.showMessageDialog(null,"Failed!!!  The string was not the grammar's sentences!");
						return;
					}
					
					else
					{
						u = 45;
						int index;
						StringBuffer strbuf = new StringBuffer();
						String str="";
						//如果查表为移进项目
						if(result1.charAt(0)=='s')
						{
							for(int y=0;y<result1.length();y++)
							{
								n[u+y]=result1.charAt(y);
								if(y>0)
								{
									//获取s后面的状态值存于strbuf中
									strbuf.append(result1.charAt(y));
								}
							}
							str=strbuf.substring(0);//将状态值给str
							index = Integer.parseInt(str);//将状态值转为整形
							strbuf.delete(0, strbuf.length());//清空strbuf
							//判断状态值，如果大于9，加括号入状态栈，否则直接入状态栈
							if(index>9)
							{
								state_stack[state_num]="("+index+")";
							}
							else
							{
								state_stack[state_num]=str;
							}
							state_num++;
							char_stack[char_num]=zifu[fzifu-1];//余串首字符入符号栈
							char_num++;
							fzifu--;
						}
						//如果查表为规约项目
						else if(result1.charAt(0)=='r')
						{
							for(int y=0;y<result1.length();y++)
							{
								n[u+y]=result1.charAt(y);
								if(y>0)
								{
									strbuf.append(result1.charAt(y));
								}
							}
							str=strbuf.substring(0);
							index = Integer.parseInt(str);//规则序号
							strbuf = null;
							int len = rule[index].length()-2;//获取规则右部长度
							state_num = state_num - len;//状态栈出栈，出栈个数为规则右部长度
							char_num = char_num - len;//符号栈出栈，出栈个数为规则右部长度
							String gox ;//保存状态栈顶元素值
							int a;
							int b;
							//取出出栈后的首个状态值  作为行
							if(state_stack[state_num-1].charAt(0)=='(')
							{
								gox = state_stack[state_num-1].substring(1, state_stack[state_num-1].length()-1);
							}
							else
							{
								gox = state_stack[state_num-1];
							}
							a = Integer.parseInt(gox);
							//扫描规则左部值付给b
							for(b=0;b<gototable.length;b++)
							{
								if(gototable[b].equals(String.valueOf(rule[index].charAt(0)))) break;
							}
							//goto值
							String result = shuju_g[a][b];
							if(result.equals(""))
							{
								n[55] = 'e';
								n[56] = 'r';
								n[57] = 'r';
								n[58] = 'o';
								n[59] = 'r';
								jta.append(String.copyValueOf(n));
								jta.append("\n"+"The string was not the grammar's sentences"+"\n");
								//JOptionPane.showMessageDialog(null,"Failed!!!  The string was not the grammar's sentences!");
								return;
							}
							else
							{
								u=55;
								for(int m=0;m<result.length();m++)
								{
									n[u+m]=result.charAt(m);
								}
								char_num++;
								char_stack[char_num-1] = rule[index].charAt(0);//规则左部入符号栈
								state_num++;
								//规约情况下查找的状态值入状态栈
								if(Integer.parseInt(result)>9)
								{
									state_stack[state_num-1] = "("+result+")";
								}
								else
								{
									state_stack[state_num-1] = result;
								}
								
								
							}
							
						}
						jta.append(String.copyValueOf(n)+"\n");
						n = new char[70];
						
					if(buzhou<10)
						n[0] = (char)('0'+buzhou);
					else
					{
						n[0] = (char)('0'+buzhou/10);
						n[1] = (char)('0'+buzhou%10);
					}
					u=10;
					for(int y=0;y<state_num;y++)
					{
						for(int x=0;x<state_stack[y].length();x++)
						{
							n[u+x]=state_stack[y].charAt(x);
							u++;
						}
					}
					u=25;
					for(int y=0;y<char_num;y++)
					{
						n[u] = char_stack[y];
						u++;
					}
					u = 35;
					for(int y=fzifu-1;y>=0;y--)
					{
						n[u] = zifu[y];
						u++;
					}

					buzhou++;
					break;
					}
				}
				if(k=="1"&&t=='#')
				{
					buzhou--;
					n = new char[70];
					
					if(buzhou<10)
						n[0] = (char)('0'+buzhou);
					else
					{
						n[0] = (char)('0'+buzhou/10);
						n[1] = (char)('0'+buzhou%10);
					}
					u=10;
					for(int y=0;y<state_num;y++)
					{
						for(int x=0;x<state_stack[y].length();x++)
						{
							n[u+x]=state_stack[y].charAt(x);
							u++;
						}
					}
					u=25;
					for(int y=0;y<char_num;y++)
					{
						n[u] = char_stack[y];
						u++;
					}
					u = 35;
					for(int y=fzifu-1;y>=0;y--)
					{
						n[u] = zifu[y];
						u++;
					}
					n[45] = 'a';
					n[46] = 'c';
					n[47] = 'c';
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
			action = action_1;
			shuju_a=shuju_a_1;
			gototable = gototable_1;
			shuju_g = shuju_g_1;
			rule = rule_1;
		}
		//文法二
		if(jrb2.isSelected())
		{
			flag = 2;
			action = action_2;
			shuju_a=shuju_a_2;
			gototable = gototable_2;
			shuju_g = shuju_g_2;
			rule = rule_2;
		}
		//文法三
		if(jrb3.isSelected())
		{
			flag = 3;
			action = action_3;
			shuju_a=shuju_a_3;
			gototable = gototable_3;
			shuju_g = shuju_g_3;
			rule = rule_3;
		}
		//文法四
		if(jrb4.isSelected())
		{
			flag = 4;
			action = action_4;
			shuju_a=shuju_a_4;
			gototable = gototable_4;
			shuju_g = shuju_g_4;
			rule = rule_4;
		}
		//生成分析表按钮
		if(e.getSource()==jb5)
		{
			if(flag!=0)
			{
				jt1 = new JTable(shuju_a,action);
				JScrollPane jtable1 = new JScrollPane(jt1);
				jtable1.setBackground(new Color(Integer.parseInt("DBDBFF", 16)));
				this.getContentPane().add(jtable1);
				jtable1.setBounds(550, 255, 200, 250);
				
				jt2 = new JTable(shuju_g,gototable);
				JScrollPane jtable2 = new JScrollPane(jt2);
				jtable2.setBackground(new Color(Integer.parseInt("DBDBFF", 16)));
				this.getContentPane().add(jtable2);
				jtable2.setBounds(750, 255, 200, 250);
				jp1.add(jtable1);
				jp1.add(jtable2);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"请选择文法!");
			}
		}
		//输入按钮
		if(e.getSource()==jb3)
		{
			analysis();
		}
		//清空按钮
		if(e.getSource()==jb4)
		{
			jtf.setText("");
		}
		//返回语法分析页面按钮
		if(e.getSource()==jb1)
		{
			new Secondpage();
			this.setVisible(false);
		}
		//切换成英文界面按钮
		if(e.getSource()==jb2)
		{
			new LR();
			this.setVisible(false);
		}
	}
}

class NewPanellr22 extends JPanel
{
	/**
	 * @author CRR
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g)
	{
		ImageIcon icon = new ImageIcon("images/05.png");
		g.drawImage(icon.getImage(), 0, 0, getSize().width, getSize().height, this);
	}
}

