package com.svlugovoy.patterns.structural.proxy;

public class Client {

    ServiceInterface service;

    public Client(ServiceInterface service) {
        this.service = service;
    }

    public ServiceInterface getService() {
        return service;
    }

    public static void main(String[] args) {

        Client client1 = new Client(new RealService());

        ServiceInterface service1 = client1.getService();
        service1.doOperation();

        Client client2 = new Client(new ProxyOfRealService(new RealService()));

        ServiceInterface service2 = client2.getService();
        service2.doOperation();

        ProxyOfRealService proxy = new ProxyOfRealService(new RealService());
        proxy.setAdmin(false);
        Client client3 = new Client(proxy);

        ServiceInterface service3 = client3.getService();
        service3.doOperation();

        ProxyOfRealService proxyCachedExample = new ProxyOfRealService(new RealService());
        Client client4 = new Client(proxyCachedExample);
        System.out.println(client4.getService().doOperation());

        Client client5 = new Client(proxyCachedExample);
        System.out.println(client5.getService().doOperation());

    }
}
