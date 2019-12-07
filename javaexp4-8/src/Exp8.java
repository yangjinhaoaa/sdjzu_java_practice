import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
public class Exp8 extends JFrame{
	Exp8 ()
	{
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container con=getContentPane();
		DefaultMutableTreeNode root=new DefaultMutableTreeNode("C:\\");
		DefaultMutableTreeNode t1=new DefaultMutableTreeNode("DOS");
		DefaultMutableTreeNode t2=new DefaultMutableTreeNode("Java");
		DefaultMutableTreeNode t1_1=new DefaultMutableTreeNode("WPS");
		DefaultMutableTreeNode t1_2=new DefaultMutableTreeNode("epg");
		DefaultMutableTreeNode t2_1=new DefaultMutableTreeNode("applet");
		DefaultMutableTreeNode t2_2=new DefaultMutableTreeNode("jre");
		root.add(t1);root.add(t2);
		t1.add(t1_1);t1.add(t1_2);
		t2.add(t2_1);t2.add(t2_2);
		JTree tree=new JTree(root);
		DefaultTreeCellRenderer render=new DefaultTreeCellRenderer();
		render.setLeafIcon(new ImageIcon("leaf.gif"));
		render.setBackground(Color.yellow);
		render.setClosedIcon(new ImageIcon("close.gif"));
		render.setOpenIcon(new ImageIcon("open.gif"));
		render.setTextSelectionColor(Color.red);
		render.setTextNonSelectionColor(Color.green);
		render.setFont(new Font("TimeRoman",Font.BOLD,16));
		tree.setCellRenderer(render);
		JScrollPane scrollpane=new JScrollPane(tree);
		con.add(scrollpane);
		validate();
	}
	public static void main(String args[])
	{
		new Exp8 ();
	}
}

