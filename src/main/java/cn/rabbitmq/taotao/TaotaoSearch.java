package cn.rabbitmq.taotao;

public class TaotaoSearch {

    //具体执行业务的方法
    public void listen(String msg) {
        System.out.println("TaotaoSearch ： " + msg);
    }
}