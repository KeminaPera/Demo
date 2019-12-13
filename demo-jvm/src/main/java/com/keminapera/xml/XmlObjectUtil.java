package com.keminapera.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

/**
 * javax.xml.bind.annotation学习使用
 *
 * @author KeminaPera
 * @date 2019/12/4 21:45
 */
public final class XmlObjectUtil {
    private XmlObjectUtil() {
    }
    public static String reverseObjectToXml(Object obj) throws JAXBException {
        StringWriter sw = new StringWriter();
        JAXBContext context = JAXBContext.newInstance(obj.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "utf-8");
        marshaller.marshal(obj, sw);
        return sw.toString();
    }

    public static void main(String[] args) throws JAXBException {
        Person person = new Person();
        person.setName("张三");
        person.setAddress(new Address("山西省", "太原市", "万柏林区"));
        person.setAge(23);
        person.setTypeValue(Type.STUDENT.getType());
        String xml = XmlObjectUtil.reverseObjectToXml(person);
        System.out.println(xml);
    }
}
