package com.company.Tp;

public interface RunnableQueue {

    //�����µ�������������Ȼ�offer��������
    void offer(Runnable runnable);

    //�����߳�ͨ��take������ȡRunnable
    Runnable take();

    //��ȡ������������������
    int size();

}
