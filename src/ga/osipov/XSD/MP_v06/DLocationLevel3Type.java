//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.21 at 09:42:06 AM MSK 
//


package ga.osipov.XSD.MP_v06;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dLocationLevel3Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dLocationLevel3Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="������"/&gt;
 *     &lt;enumeration value="����"/&gt;
 *     &lt;enumeration value="����"/&gt;
 *     &lt;enumeration value="������"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "dLocationLevel3Type")
@XmlEnum
public enum DLocationLevel3Type {


    /**
     * ��������
     * 
     */
    @XmlEnumValue("\u0441\u0442\u0440\u043e\u0435\u043d")
    ������("\u0441\u0442\u0440\u043e\u0435\u043d"),

    /**
     * ������
     * 
     */
    @XmlEnumValue("\u043a\u043e\u0440\u043f")
    ����("\u043a\u043e\u0440\u043f"),

    /**
     * ����
     * 
     */
    @XmlEnumValue("\u0431\u043b\u043e\u043a")
    ����("\u0431\u043b\u043e\u043a"),

    /**
     * ������
     * 
     */
    @XmlEnumValue("\u043b\u0438\u0442\u0435\u0440\u0430")
    ������("\u043b\u0438\u0442\u0435\u0440\u0430");
    private final String value;

    DLocationLevel3Type(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DLocationLevel3Type fromValue(String v) {
        for (DLocationLevel3Type c: DLocationLevel3Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}