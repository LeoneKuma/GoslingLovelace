package com.example.goslinglovelace;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private TextView text_ada;
    private TextView text_gosling;
    private TextView textTitleAda;
    private TextView textTitleGosling;
    private String language;
    //private Spinner sp_ada;
    //private Spinner sp_gosling;
    private boolean spState_ada=false;
    private boolean spState_gosling=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLanguage();
        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.land);
            textTitleGosling=(TextView)findViewById(R.id.textView2);
            text_gosling=(TextView)findViewById(R.id.txt_land_content);
            text_gosling.setMovementMethod(ScrollingMovementMethod.getInstance());
         //   sp_gosling=(Spinner)findViewById(R.id.spinner_land);
            /*sp_gosling.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if(spState_gosling=false) {
                        spState_gosling=true;
                    }
                    else if(spState_gosling=true){
                        language = parent.getItemAtPosition(position).toString();
                        setGoslingContent();
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });*/
            //setLanguage();
            setGoslingContent();
        } else if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.port);
            textTitleAda=(TextView)findViewById(R.id.txt_title);
         //   sp_ada=(Spinner)findViewById(R.id.spinner_port);
            text_ada=(TextView)findViewById(R.id.txt_port_content);
            text_ada.setMovementMethod(ScrollingMovementMethod.getInstance());
            /*sp_ada.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if(spState_ada=false) {
                        spState_ada=true;
                    }
                    else if(spState_ada=true){
                        language = parent.getItemAtPosition(position).toString();
                        setAdaContent();
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });*/
          //  setLanguage();
            setAdaContent();
        }


    }
    public void setAdaContent(){
        String content="";
        if(language.equals("English")) {
            textTitleAda.setText("Ada Lovelace");
             content = "Augusta Ada King, Countess of Lovelace (née Byron; 10 December 1815 – 27 November 1852) was an English mathematician and writer, chiefly known for her work on Charles Babbage's proposed mechanical general-purpose computer, the Analytical Engine. She was the first to recognise that the machine had applications beyond pure calculation, and published the first algorithm intended to be carried out by such a machine. As a result, she is sometimes regarded as the first to recognise the full potential of a \"computing machine\" and one of the first computer programmers.[2][3][4]\n" +
                    "\n" +
                    "Lovelace was the only legitimate child of the poet Lord Byron and his wife Anne Isabella \"Annabella\" Milbanke, Lady Wentworth.[5] All of Byron's other children were born out of wedlock to other women.[6] Byron separated from his wife a month after Ada was born and left England forever four months later. He commemorated the parting in a poem that begins, \"Is thy face like thy mother's my fair child! ADA! sole daughter of my house and heart?\".[7] He died of disease in the Greek War of Independence when Ada was eight years old. Her mother remained bitter and promoted Ada's interest in mathematics and logic in an effort to prevent her from developing her father's perceived insanity. Despite this, Ada remained interested in Byron and was, upon her eventual death, buried next to him at her request. She was often ill in her childhood. Ada married William King in 1835. King was made Earl of Lovelace in 1838, Ada thereby becoming Countess of Lovelace.\n" +
                    "\n" +
                    "Her educational and social exploits brought her into contact with scientists such as Andrew Crosse, Sir David Brewster, Charles Wheatstone, Michael Faraday and the author Charles Dickens, contacts which she used to further her education. Ada described her approach as \"poetical science\"[8] and herself as an \"Analyst (& Metaphysician)\".[9]\n" +
                    "\n" +
                    "When she was a teenager, her mathematical talents led her to a long working relationship and friendship with fellow British mathematician Charles Babbage, also known as \"the father of computers\", and in particular, Babbage's work on the Analytical Engine. Lovelace first met him in June 1833, through their mutual friend, and her private tutor, Mary Somerville.\n" +
                    "\n" +
                    "Between 1842 and 1843, Ada translated an article by Italian military engineer Luigi Menabrea on the calculating engine, supplementing it with an elaborate set of notes, simply called Notes. These notes contain what many consider to be the first computer program—that is, an algorithm designed to be carried out by a machine. Other historians reject this perspective and point out that Babbage's personal notes from the years 1836/1837 contain the first programs for the engine.[10] Lovelace's notes are important in the early history of computers. She also developed a vision of the capability of computers to go beyond mere calculating or number-crunching, while many others, including Babbage himself, focused only on those capabilities.[11] Her mindset of \"poetical science\" led her to ask questions about the Analytical Engine (as shown in her notes) examining how individuals and society relate to technology as a collaborative tool.[6]\n" +
                    "\n" +
                    "She died of uterine cancer in 1852 at the age of 36.";
        }
        else if(language.equals("Simplified Chinese")){
            textTitleAda.setText("阿达·洛芙莱斯");
            content="奥古斯塔·阿达·金，勒芙蕾丝伯爵夫人（Augusta Ada King, Countess of Lovelace，1815年12月10日－1852年11月27日），原名奥古斯塔·阿达·拜伦（Augusta Ada Byron），通称阿达·洛芙莱斯（Ada Lovelace），是著名英国诗人拜伦之女，数学家。计算机程序创始人，建立了循环和子程序概念。\n" +
                    "为计算程序拟定“算法”，写作的第一份“程序设计流程图”，被珍视为“第一位给计算机写程序的人”。为了纪念阿达·奥古斯塔对现代电脑与软件工程所产生的重大影响，美国国防部将耗费巨资、历时近20年研制成功的高级程序语言命名为Ada语言，它被公认为是第四代计算机语言的主要代表。\n" +"阿达是她诗人父亲—拜伦与母亲安妮·伊莎贝拉·米尔班奇（Anne Isabella Milbanke）唯一的" +
                    "合法子嗣。她的名字取自拜伦的异母的姐姐奥古斯塔·李（Augusta Leigh）。\n" +
                    "据加利福尼亚大学圣迭戈分校的记载，阿达原名奥古斯塔·阿达·拜伦，是著名诗人乔治·戈登·拜伦（George Gordon Byron）的女儿，在她出生后不久，她的父母就离异。\n" +
                    "她的母亲鼓励她从事数学研究，以避免像她的父亲那样出现“危险的诗人倾向”。\n" +
                    "拜伦与安妮贝拉的婚事是在奥古斯塔为了避免丑闻，而怂恿拜伦与安妮贝拉结合的产物。然而，在1816年1月16日，安妮贝拉还是离开拜伦，带着一个月大的阿达离开。同年4月21日，拜伦签下了分居协议，并离开英国。\n" +
                    "阿达从未见过她同父异母的妹妹阿拉格·拜伦（Allegra Byron），阿拉格是拜伦与克莱尔·克莱蒙（Claire Clairmont）所生，但于1822年死去，得年5岁。至于阿达的另一位亲戚伊丽莎白·梅朵拉·李（Elizabeth Medora Leigh，是奥古斯塔·李之女）则有与她照过面，并由阿达的母亲告知阿达与梅朵拉彼此的身世。\n" +
                    "阿达与她的母亲同住。她的母亲Anne Isabella对数学感到极高的兴趣（其夫拜伦称她为The Princess of Parallelograms，即平行四边形公主），数学占有她人生的绝大部分，即使结婚之后也是如此。而阿达的母亲Anne让她年轻时就学习数学一事，却总是被认为是受到其父拜伦的影响。阿达的数学与科学课程是由家庭教师威廉·福莱德（William Frend）、威廉·金（William King）与玛丽·索麦维（en:Mary Somerville）所指导，后来更接受奥古斯都·德·摩根的教导。阿达也是一位活跃于伦敦社交圈的女士，这位女士曾在年轻时是女学究（Blue Stockings Society）的会员。\n" +
                    "1835年，"+
                    "爱达·勒芙蕾丝" +
                    "阿达嫁给了威廉·金（后来晋封为第一代勒芙蕾丝伯爵）。他们总共生下三个孩子：\n" +
                    "拜伦（Byron，生于1836年5月12日）、\n" +
                    "安妮贝拉（Annabella，生于1837年9月22日）\n" +
                    "拉尔夫·戈登（Ralph Gordon，生于1839年7月2日）勒芙蕾丝一家住在瑟瑞（Surrey）的奥坎（Ockham）。\n" +
                    "而自婚后，她的头衔则变成奥古斯塔·阿达，勒芙蕾丝伯爵夫人阁下（The Right Honourable Augusta Ada, Countess of Lovelace），不过较简单的阿达·勒芙蕾丝和婚前名称阿达·拜伦。\n" +
                    "她的老师玛丽·索麦维是一位著名的19世纪科学家，并由这位学者于1833年6月5日介绍给查尔斯·巴贝奇。著名的大卫·布鲁斯特爵士（Sir David Brewster）、查尔斯·卫斯顿（Charles Wheatstone）、查尔斯·狄更斯与麦可·法拉第也认识她。";
        }
        text_ada.setText(content);


    }
    public void setGoslingContent(){
        String content="";
        if(language.equals("English")) {
            textTitleGosling.setText("James Gosling");
            content = "James Gosling received a Bachelor of Science from the University of Calgary [4] and his M.A. and Ph.D. from Carnegie Mellon University, all in computer science.[2][5][6] He wrote a version of Emacs called Gosling Emacs (Gosmacs) while working toward his doctorate. He built a multi-processor version of Unix for a 16-way computer system[7] while at Carnegie Mellon University, before joining Sun Microsystems. He also developed several compilers and mail systems there.\n" +
                    "\n" +
                    "Gosling was with Sun Microsystems between 1984 and 2010 (26 years). He is known as the father of the Java programming language.[8][9] He got the idea for the Java VM while writing a program to port software from a PERQ by translating Perq Q-Code to VAX assembler and emulating the hardware. He left Sun Microsystems on April 2, 2010 after it was acquired by the Oracle Corporation,[8] citing reductions in pay, status, and decision-making ability, along with change of role and ethical challenges.[10] He has since taken a very critical stance towards Oracle in interviews, noting that \"during the integration meetings between Sun and Oracle, where we were being grilled about the patent situation between Sun and Google, we could see the Oracle lawyer's eyes sparkle.\"[9] He clarified his position during the Oracle v Google trial over Android: \"While I have differences with Oracle, in this case, they are on the right. Google totally slimed Sun. We were all really disturbed, even Jonathan Schwartz; he just decided to put on a happy face and tried to turn lemons into lemonade, which annoyed a lot of folks on Sun.\"[11] However, he approved of the court's ruling that APIs should not be copyrightable.[12]\n" +
                    "\n" +
                    "In March 2011, Gosling left Oracle to work at Google.[13] Six months later, he followed his colleague Bill Vass and joined a startup called Liquid Robotics.[1] In late 2016, Liquid Robotics was acquired by Boeing.[14] Following the acquisition, Gosling left Liquid Robotics to work at Amazon Web Services as Distinguished Engineer in May 2017.[15]\n" +
                    "\n" +
                    "He is an adviser at the Scala company Lightbend,[16] Independent Director at Jelastic,[17] and Strategic Advisor for Eucalyptus,[18] and is a board member of DIRTT Environmental Solutions.[19]\n" +
                    "\n" +
                    "He is known for his love of proving \"the unknown\" and has noted that his favorite irrational number is √2. He has a framed picture of the first 1,000 digits of √2 in his office.[20]Gosling initially became known as the author of Gosling Emacs, and also invented the windowing system NeWS, which lost out to X Window because Sun did not give it an open source license. He is generally credited with having invented the Java programming language in 1994.[21][22][23] He created the original design of Java and implemented the language's original compiler and virtual machine.[24] Gosling traces the origins of the approach to his early graduate-student days, when he created a p-code virtual machine for the lab's DEC VAX computer, so that his professor could run programs written in UCSD Pascal. In the work leading to Java at Sun, he saw that architecture-neutral execution for widely distributed programs could be achieved by implementing a similar philosophy: always program for the same virtual machine.[25]\n" +
                    "\n" +
                    "For his achievement, the National Academy of Engineering in the United States elected him as a Foreign Associate member.[26] Another contribution of Gosling's was co-writing the \"bundle\" program, a utility thoroughly detailed in Brian Kernighan and Rob Pike's book The Unix Programming Environment.";
        }
        else if(language.equals("Simplified Chinese")){
            textTitleGosling.setText("詹姆斯·高斯林");
            content="詹姆斯·高斯林收到理学士从卡尔加里大学 [4]以及他的硕士和博士学位卡内基梅隆大学，全在计算机科学.[2][5][6]他写了一个版本埃马克斯叫小鹅Emacs(戈斯麦斯)在攻读博士学位时。他为16路计算机系统建立了一个多处理器版本的unix。[7]在卡内基梅隆大学，在加入之前太阳微系统。他还开发了几个编译器和邮件系统那里。\n" +
                    "\n" +
                    "1984年至2010年(26年)，戈斯林在太阳微系统公司工作。他被称为Java编程语言.[8][9]他想到了JavaVM将程序编写到移植软件的过程中，佩尔克通过将Perqq-代码转换为VAX汇编程序，并对硬件进行仿真.2010年4月2日，他离开了Sun微系统公司。甲骨文公司,[8]引用了薪酬、地位和决策能力的下降，以及角色的改变和道德上的挑战。[10]此后，他在接受采访时对甲骨文采取了非常严厉的立场。他指出，“在Sun和Oracle的整合会议上，我们被问及Sun和Google之间的专利状况时，我们可以看到甲骨文律师的眼睛闪闪发亮。”[9]他在会议期间澄清了他的立场。甲骨文诉谷歌Android的试用版：“虽然我和甲骨文有不同之处，但在这个例子中，他们是正确的。谷歌完全精简了Sun。我们都感到非常不安，甚至乔纳森·施瓦茨他只是想装出一张高兴的脸，想把柠檬变成柠檬水，这让很多人很生气。“[11]然而，他赞同法院的裁决，即API不应具有版权。[12]\n" +
                    "\n" +
                    "2011年3月，戈斯林离开甲骨文谷歌.[13]六个月后，他跟踪了他的同事比尔·瓦斯加入了一家名为液体机器人.[1]2016年末，液态机器人被波音公司.[14]在收购之后，戈斯林离开了液体机器人公司。AmazonWeb服务2017年5月成为杰出工程师。[15]\n" +
                    "\n" +
                    "他是斯卡拉公司光弯,[16]独立董事弹力,[17]和战略顾问桉树,[18]是DIRTT环境解决方案的董事会成员。[19]\n" +
                    "\n" +
                    "他以爱证明“未知”而闻名，并指出他最喜欢的是无理数是√2。他有一张头1，000位数字的相框图片√2在他的办公室里。[20]\n高斯林最初被称为小鹅Emacs，并发明了窗口系统。新闻，输给了X窗口因为Sun没有给它一个开源许可。人们普遍认为他发明了爪哇1994年的编程语言。[21][22][23]他创建了Java的原始设计，并实现了该语言的原始编译器虚拟机.[24]高斯林将这种方法的起源追溯到他早期的研究生时代，当时他创建了一个P码虚拟机为了实验室德瓦克斯计算机，这样他的教授就可以运行写在UCSD PASCAL。在Sun引入Java的工作中，他看到了对广泛分布的程序执行体系结构的中立，可以通过实现类似的理念来实现：始终为同一个虚拟机编写程序。[25]\n" +
                    "\n" +
                    "因为他的成就国家工程学院在.。美国选举他为外国联系成员。[26]高斯林的另一个贡献是合作编写了“束“程序，详细说明的实用程序布赖恩·克尼汉和罗伯派克书Unix编程环境."+"2002年：他被授予经济学人创新奖。[27]\n" +
                    "2002年：他被授予火焰奖Usenix终身成就奖。[28]\n" +
                    "2007年：他被任命为加拿大勋章.[29]这个命令是加拿大第二高的平民荣誉。军官是该命令中的第二最高级别。\n" +
                    "2013年：他成为院士.的.计算机械协会.[30]\n" +
                    "2015年：授予IEEE约翰·冯·诺依曼奖章[31]";
        }
        text_gosling.setText(content);
    }
    public void setLanguage(){
        Locale locale = Locale.getDefault();
        //String lang = locale.getLanguage() + "-" + locale.getCountry();
        String lang = locale.getLanguage();
        //Toast.makeText(getApplicationContext(),lang,Toast.LENGTH_SHORT).show();
        //String str[]=lang.split(":");
       // textTitleAda.setText(lang);
        if(lang.equals("en")){
            language="English";
           // Toast.makeText(this.getBaseContext(),"1",Toast.LENGTH_SHORT).show();
        }
        else if(lang.equals("zh")){
            language="Simplified Chinese";
           // Toast.makeText(this.getBaseContext(),"2",Toast.LENGTH_SHORT).show();

        }
        //Toast.makeText(this.getBaseContext(),"3",Toast.LENGTH_SHORT).show();




    }

}
