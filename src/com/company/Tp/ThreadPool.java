package com.company.Tp;

public interface ThreadPool {

    //�ύ�����̳߳�
    void execute(Runnable runnable);

    //�ر��̳߳�
    void shutdown();

    //��ȡ�̳߳صĳ�ʼ����С
    int getInitSize();

    //��ȡ�̳߳������߳���
    int getMaxSize();

    //��ȡ�̳߳غ����߳�����
    int getCoreSize();

    //��ȡ�̳߳������ڻ���������еĴ�С
    int getQueueSize();

    //��ȡ�̳߳��л�Ծ�̵߳�����
    int getActiveCount();

    //�鿴�̳߳��Ƿ��Ѿ���shutdown
    boolean isShutdown();
}
