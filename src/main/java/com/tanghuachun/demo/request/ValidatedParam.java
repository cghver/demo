package com.tanghuachun.demo.request;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
public class ValidatedParam implements Serializable {
    @NotNull(message = "姓名不能为空")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ValidatedParam{" +
                "name='" + name + '\'' +
                '}';
    }
}
