package com.intergraph.xmlanno;

import javax.annotation.Resource;

public class BookService {

    //得到bookdao和ordersdao的对象
    @Resource(name = "bookDao")
    private BookDao bookDao;
    @Resource(name = "ordersDao")
    private OrdersDao ordersDao;


    public void add() {
        System.out.println("service............");
        bookDao.book();
        ordersDao.buy();
    }
}
