package palworldconfig.model;

import java.util.List;

public class LayTableVo {
    private int code; //数据状态
    private String msg; //状态信息
    private int count; //数据总数
    private List<? extends Object> data; //数据列表

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<? extends Object> getData() {
        return data;
    }

    public void setData(List<? extends Object> data) {
        this.data = data;
    }
}
