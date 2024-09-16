package pack_6;
class Logger {
    private static Logger instance; 
    private String msg;

    private Logger() {
        this.msg = "";
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void clearMsg() {
        this.msg = "";
    }

    public void setMsg(String msg) {
        this.msg += msg + "\n"; 

    }
    public String getMsg() {
        return this.msg;
    }
}

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.setMsg("I am Aditya");
        logger.setMsg("I am Aditi");
        System.out.println("Logger 1:\n" + logger.getMsg());

          
        Logger logger2 = Logger.getInstance();
        logger.setMsg("I am Aarzu");
        logger.setMsg("I am Ayesha");
        System.out.println("Logger 2:\n" + logger2.getMsg());

        logger.clearMsg();
        System.out.println("Logger 1 after clearing:\n" + logger.getMsg());
         logger2.clearMsg();
        System.out.println("Logger 2 after clearing:\n" + logger2.getMsg());
    }
}
