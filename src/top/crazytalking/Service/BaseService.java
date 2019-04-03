package top.crazytalking.Service;

import top.crazytalking.Utils.ServiceUtils;

public abstract class BaseService {
    public int code;
    public String msg;
    public Object data;

    public BaseService() {

    }

    public void start() {
        try {
            run();
        } catch (Exception e) {
            System.out.println("service exception");
            e.printStackTrace();
            ServiceUtils.createError(this, "处理异常");
        }
    }


    protected abstract void run() throws Exception;
}
