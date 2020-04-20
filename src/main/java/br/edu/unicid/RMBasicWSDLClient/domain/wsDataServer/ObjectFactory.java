//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.03.16 às 03:42:44 PM BRT 
//


package br.edu.unicid.RMBasicWSDLClient.domain.wsDataServer;

import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.springframework.xml.transform.StringResult;

import br.edu.unicid.RMBasicWSDLClient.domain.MovMovimentoTBCData.MovMovimento;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.unicid.RMBasicWSDLClient.domain.wsDataServer package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Type_QNAME = new QName("http://schemas.datacontract.org/2004/07/System", "Type");
    private final static QName _MemberInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Reflection", "MemberInfo");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ImplementsType_QNAME = new QName("http://www.totvs.com/", "type");
    private final static QName _AutenticaAcessoResponseAutenticaAcessoResult_QNAME = new QName("http://www.totvs.com/", "AutenticaAcessoResult");
    private final static QName _GetSchemaDataServerName_QNAME = new QName("http://www.totvs.com/", "DataServerName");
    private final static QName _GetSchemaContexto_QNAME = new QName("http://www.totvs.com/", "Contexto");
    private final static QName _GetSchemaResponseGetSchemaResult_QNAME = new QName("http://www.totvs.com/", "GetSchemaResult");
    private final static QName _IsValidDataServerResponseIsValidDataServerResult_QNAME = new QName("http://www.totvs.com/", "IsValidDataServerResult");
    private final static QName _GetSchemaEmailEmailUsuarioContexto_QNAME = new QName("http://www.totvs.com/", "EmailUsuarioContexto");
    private final static QName _GetSchemaEmailResponseGetSchemaEmailResult_QNAME = new QName("http://www.totvs.com/", "GetSchemaEmailResult");
    private final static QName _ReadViewFiltro_QNAME = new QName("http://www.totvs.com/", "Filtro");
    private final static QName _ReadViewResponseReadViewResult_QNAME = new QName("http://www.totvs.com/", "ReadViewResult");
    private final static QName _ReadViewEmailResponseReadViewEmailResult_QNAME = new QName("http://www.totvs.com/", "ReadViewEmailResult");
    private final static QName _ReadRecordPrimaryKey_QNAME = new QName("http://www.totvs.com/", "PrimaryKey");
    private final static QName _ReadRecordResponseReadRecordResult_QNAME = new QName("http://www.totvs.com/", "ReadRecordResult");
    private final static QName _ReadRecordEmailResponseReadRecordEmailResult_QNAME = new QName("http://www.totvs.com/", "ReadRecordEmailResult");
    private final static QName _SaveRecordXML_QNAME = new QName("http://www.totvs.com/", "XML");
    private final static QName _SaveRecordResponseSaveRecordResult_QNAME = new QName("http://www.totvs.com/", "SaveRecordResult");
    private final static QName _SaveRecordEmailResponseSaveRecordEmailResult_QNAME = new QName("http://www.totvs.com/", "SaveRecordEmailResult");
    private final static QName _DeleteRecordResponseDeleteRecordResult_QNAME = new QName("http://www.totvs.com/", "DeleteRecordResult");
    private final static QName _DeleteRecordEmailResponseDeleteRecordEmailResult_QNAME = new QName("http://www.totvs.com/", "DeleteRecordEmailResult");
    private final static QName _DeleteRecordByKeyResponseDeleteRecordByKeyResult_QNAME = new QName("http://www.totvs.com/", "DeleteRecordByKeyResult");
    private final static QName _ReadLookupViewOwnerData_QNAME = new QName("http://www.totvs.com/", "OwnerData");
    private final static QName _ReadLookupViewResponseReadLookupViewResult_QNAME = new QName("http://www.totvs.com/", "ReadLookupViewResult");
    private final static QName _ReadLookupViewEmailResponseReadLookupViewEmailResult_QNAME = new QName("http://www.totvs.com/", "ReadLookupViewEmailResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.unicid.RMBasicWSDLClient.domain.wsDataServer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Implements }
     * 
     */
    public Implements createImplements() {
        return new Implements();
    }

    /**
     * Create an instance of {@link Type }
     * 
     */
    public Type createType() {
        return new Type();
    }

    /**
     * Create an instance of {@link ImplementsResponse }
     * 
     */
    public ImplementsResponse createImplementsResponse() {
        return new ImplementsResponse();
    }

    /**
     * Create an instance of {@link CheckServiceActivity }
     * 
     */
    public CheckServiceActivity createCheckServiceActivity() {
        return new CheckServiceActivity();
    }

    /**
     * Create an instance of {@link CheckServiceActivityResponse }
     * 
     */
    public CheckServiceActivityResponse createCheckServiceActivityResponse() {
        return new CheckServiceActivityResponse();
    }

    /**
     * Create an instance of {@link AutenticaAcesso }
     * 
     */
    public AutenticaAcesso createAutenticaAcesso() {
        return new AutenticaAcesso();
    }

    /**
     * Create an instance of {@link AutenticaAcessoResponse }
     * 
     */
    public AutenticaAcessoResponse createAutenticaAcessoResponse() {
        return new AutenticaAcessoResponse();
    }

    /**
     * Create an instance of {@link GetSchema }
     * 
     */
    public GetSchema createGetSchema() {
        return new GetSchema();
    }

    /**
     * Create an instance of {@link GetSchemaResponse }
     * 
     */
    public GetSchemaResponse createGetSchemaResponse() {
        return new GetSchemaResponse();
    }

    /**
     * Create an instance of {@link IsValidDataServer }
     * 
     */
    public IsValidDataServer createIsValidDataServer() {
        return new IsValidDataServer();
    }

    /**
     * Create an instance of {@link IsValidDataServerResponse }
     * 
     */
    public IsValidDataServerResponse createIsValidDataServerResponse() {
        return new IsValidDataServerResponse();
    }

    /**
     * Create an instance of {@link GetSchemaEmail }
     * 
     */
    public GetSchemaEmail createGetSchemaEmail() {
        return new GetSchemaEmail();
    }

    /**
     * Create an instance of {@link GetSchemaEmailResponse }
     * 
     */
    public GetSchemaEmailResponse createGetSchemaEmailResponse() {
        return new GetSchemaEmailResponse();
    }

    /**
     * Create an instance of {@link ReadView }
     * 
     */
    public ReadView createReadView() {
        return new ReadView();
    }

    /**
     * Create an instance of {@link ReadViewResponse }
     * 
     */
    public ReadViewResponse createReadViewResponse() {
        return new ReadViewResponse();
    }

    /**
     * Create an instance of {@link ReadViewEmail }
     * 
     */
    public ReadViewEmail createReadViewEmail() {
        return new ReadViewEmail();
    }

    /**
     * Create an instance of {@link ReadViewEmailResponse }
     * 
     */
    public ReadViewEmailResponse createReadViewEmailResponse() {
        return new ReadViewEmailResponse();
    }

    /**
     * Create an instance of {@link ReadRecord }
     * 
     */
    public ReadRecord createReadRecord() {
        return new ReadRecord();
    }

    /**
     * Create an instance of {@link ReadRecordResponse }
     * 
     */
    public ReadRecordResponse createReadRecordResponse() {
        return new ReadRecordResponse();
    }

    /**
     * Create an instance of {@link ReadRecordEmail }
     * 
     */
    public ReadRecordEmail createReadRecordEmail() {
        return new ReadRecordEmail();
    }

    /**
     * Create an instance of {@link ReadRecordEmailResponse }
     * 
     */
    public ReadRecordEmailResponse createReadRecordEmailResponse() {
        return new ReadRecordEmailResponse();
    }

    /**
     * Create an instance of {@link SaveRecord }
     * 
     */
    public SaveRecord createSaveRecord() {
        return new SaveRecord();
    }

    /**
     * Create an instance of {@link SaveRecordResponse }
     * 
     */
    public SaveRecordResponse createSaveRecordResponse() {
        return new SaveRecordResponse();
    }

    /**
     * Create an instance of {@link SaveRecordEmail }
     * 
     */
    public SaveRecordEmail createSaveRecordEmail() {
        return new SaveRecordEmail();
    }

    /**
     * Create an instance of {@link SaveRecordEmailResponse }
     * 
     */
    public SaveRecordEmailResponse createSaveRecordEmailResponse() {
        return new SaveRecordEmailResponse();
    }

    /**
     * Create an instance of {@link DeleteRecord }
     * 
     */
    public DeleteRecord createDeleteRecord() {
        return new DeleteRecord();
    }

    /**
     * Create an instance of {@link DeleteRecordResponse }
     * 
     */
    public DeleteRecordResponse createDeleteRecordResponse() {
        return new DeleteRecordResponse();
    }

    /**
     * Create an instance of {@link DeleteRecordEmail }
     * 
     */
    public DeleteRecordEmail createDeleteRecordEmail() {
        return new DeleteRecordEmail();
    }

    /**
     * Create an instance of {@link DeleteRecordEmailResponse }
     * 
     */
    public DeleteRecordEmailResponse createDeleteRecordEmailResponse() {
        return new DeleteRecordEmailResponse();
    }

    /**
     * Create an instance of {@link DeleteRecordByKey }
     * 
     */
    public DeleteRecordByKey createDeleteRecordByKey() {
        return new DeleteRecordByKey();
    }

    /**
     * Create an instance of {@link DeleteRecordByKeyResponse }
     * 
     */
    public DeleteRecordByKeyResponse createDeleteRecordByKeyResponse() {
        return new DeleteRecordByKeyResponse();
    }

    /**
     * Create an instance of {@link ReadLookupView }
     * 
     */
    public ReadLookupView createReadLookupView() {
        return new ReadLookupView();
    }

    /**
     * Create an instance of {@link ReadLookupViewResponse }
     * 
     */
    public ReadLookupViewResponse createReadLookupViewResponse() {
        return new ReadLookupViewResponse();
    }

    /**
     * Create an instance of {@link ReadLookupViewEmail }
     * 
     */
    public ReadLookupViewEmail createReadLookupViewEmail() {
        return new ReadLookupViewEmail();
    }

    /**
     * Create an instance of {@link ReadLookupViewEmailResponse }
     * 
     */
    public ReadLookupViewEmailResponse createReadLookupViewEmailResponse() {
        return new ReadLookupViewEmailResponse();
    }

    /**
     * Create an instance of {@link MemberInfo }
     * 
     */
    public MemberInfo createMemberInfo() {
        return new MemberInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System", name = "Type")
    public JAXBElement<Type> createType(Type value) {
        return new JAXBElement<Type>(_Type_QNAME, Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Reflection", name = "MemberInfo")
    public JAXBElement<MemberInfo> createMemberInfo(MemberInfo value) {
        return new JAXBElement<MemberInfo>(_MemberInfo_QNAME, MemberInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "type", scope = Implements.class)
    public JAXBElement<Type> createImplementsType(Type value) {
        return new JAXBElement<Type>(_ImplementsType_QNAME, Type.class, Implements.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "AutenticaAcessoResult", scope = AutenticaAcessoResponse.class)
    public JAXBElement<String> createAutenticaAcessoResponseAutenticaAcessoResult(String value) {
        return new JAXBElement<String>(_AutenticaAcessoResponseAutenticaAcessoResult_QNAME, String.class, AutenticaAcessoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "DataServerName", scope = GetSchema.class)
    public JAXBElement<String> createGetSchemaDataServerName(String value) {
        return new JAXBElement<String>(_GetSchemaDataServerName_QNAME, String.class, GetSchema.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "Contexto", scope = GetSchema.class)
    public JAXBElement<String> createGetSchemaContexto(String value) {
        return new JAXBElement<String>(_GetSchemaContexto_QNAME, String.class, GetSchema.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "GetSchemaResult", scope = GetSchemaResponse.class)
    public JAXBElement<String> createGetSchemaResponseGetSchemaResult(String value) {
        return new JAXBElement<String>(_GetSchemaResponseGetSchemaResult_QNAME, String.class, GetSchemaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "DataServerName", scope = IsValidDataServer.class)
    public JAXBElement<String> createIsValidDataServerDataServerName(String value) {
        return new JAXBElement<String>(_GetSchemaDataServerName_QNAME, String.class, IsValidDataServer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "IsValidDataServerResult", scope = IsValidDataServerResponse.class)
    public JAXBElement<Object> createIsValidDataServerResponseIsValidDataServerResult(Object value) {
        return new JAXBElement<Object>(_IsValidDataServerResponseIsValidDataServerResult_QNAME, Object.class, IsValidDataServerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "DataServerName", scope = GetSchemaEmail.class)
    public JAXBElement<String> createGetSchemaEmailDataServerName(String value) {
        return new JAXBElement<String>(_GetSchemaDataServerName_QNAME, String.class, GetSchemaEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "Contexto", scope = GetSchemaEmail.class)
    public JAXBElement<String> createGetSchemaEmailContexto(String value) {
        return new JAXBElement<String>(_GetSchemaContexto_QNAME, String.class, GetSchemaEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "EmailUsuarioContexto", scope = GetSchemaEmail.class)
    public JAXBElement<String> createGetSchemaEmailEmailUsuarioContexto(String value) {
        return new JAXBElement<String>(_GetSchemaEmailEmailUsuarioContexto_QNAME, String.class, GetSchemaEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "GetSchemaEmailResult", scope = GetSchemaEmailResponse.class)
    public JAXBElement<String> createGetSchemaEmailResponseGetSchemaEmailResult(String value) {
        return new JAXBElement<String>(_GetSchemaEmailResponseGetSchemaEmailResult_QNAME, String.class, GetSchemaEmailResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "DataServerName", scope = ReadView.class)
    public JAXBElement<String> createReadViewDataServerName(String value) {
        return new JAXBElement<String>(_GetSchemaDataServerName_QNAME, String.class, ReadView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "Filtro", scope = ReadView.class)
    public JAXBElement<String> createReadViewFiltro(String value) {
        return new JAXBElement<String>(_ReadViewFiltro_QNAME, String.class, ReadView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "Contexto", scope = ReadView.class)
    public JAXBElement<String> createReadViewContexto(String value) {
        return new JAXBElement<String>(_GetSchemaContexto_QNAME, String.class, ReadView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "ReadViewResult", scope = ReadViewResponse.class)
    public JAXBElement<String> createReadViewResponseReadViewResult(String value) {
        return new JAXBElement<String>(_ReadViewResponseReadViewResult_QNAME, String.class, ReadViewResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "DataServerName", scope = ReadViewEmail.class)
    public JAXBElement<String> createReadViewEmailDataServerName(String value) {
        return new JAXBElement<String>(_GetSchemaDataServerName_QNAME, String.class, ReadViewEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "Filtro", scope = ReadViewEmail.class)
    public JAXBElement<String> createReadViewEmailFiltro(String value) {
        return new JAXBElement<String>(_ReadViewFiltro_QNAME, String.class, ReadViewEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "Contexto", scope = ReadViewEmail.class)
    public JAXBElement<String> createReadViewEmailContexto(String value) {
        return new JAXBElement<String>(_GetSchemaContexto_QNAME, String.class, ReadViewEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "EmailUsuarioContexto", scope = ReadViewEmail.class)
    public JAXBElement<String> createReadViewEmailEmailUsuarioContexto(String value) {
        return new JAXBElement<String>(_GetSchemaEmailEmailUsuarioContexto_QNAME, String.class, ReadViewEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "ReadViewEmailResult", scope = ReadViewEmailResponse.class)
    public JAXBElement<String> createReadViewEmailResponseReadViewEmailResult(String value) {
        return new JAXBElement<String>(_ReadViewEmailResponseReadViewEmailResult_QNAME, String.class, ReadViewEmailResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "DataServerName", scope = ReadRecord.class)
    public JAXBElement<String> createReadRecordDataServerName(String value) {
        return new JAXBElement<String>(_GetSchemaDataServerName_QNAME, String.class, ReadRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "PrimaryKey", scope = ReadRecord.class)
    public JAXBElement<String> createReadRecordPrimaryKey(String value) {
        return new JAXBElement<String>(_ReadRecordPrimaryKey_QNAME, String.class, ReadRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "Contexto", scope = ReadRecord.class)
    public JAXBElement<String> createReadRecordContexto(String value) {
        return new JAXBElement<String>(_GetSchemaContexto_QNAME, String.class, ReadRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "ReadRecordResult", scope = ReadRecordResponse.class)
    public JAXBElement<String> createReadRecordResponseReadRecordResult(String value) {
        return new JAXBElement<String>(_ReadRecordResponseReadRecordResult_QNAME, String.class, ReadRecordResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "DataServerName", scope = ReadRecordEmail.class)
    public JAXBElement<String> createReadRecordEmailDataServerName(String value) {
        return new JAXBElement<String>(_GetSchemaDataServerName_QNAME, String.class, ReadRecordEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "PrimaryKey", scope = ReadRecordEmail.class)
    public JAXBElement<String> createReadRecordEmailPrimaryKey(String value) {
        return new JAXBElement<String>(_ReadRecordPrimaryKey_QNAME, String.class, ReadRecordEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "Contexto", scope = ReadRecordEmail.class)
    public JAXBElement<String> createReadRecordEmailContexto(String value) {
        return new JAXBElement<String>(_GetSchemaContexto_QNAME, String.class, ReadRecordEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "EmailUsuarioContexto", scope = ReadRecordEmail.class)
    public JAXBElement<String> createReadRecordEmailEmailUsuarioContexto(String value) {
        return new JAXBElement<String>(_GetSchemaEmailEmailUsuarioContexto_QNAME, String.class, ReadRecordEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "ReadRecordEmailResult", scope = ReadRecordEmailResponse.class)
    public JAXBElement<String> createReadRecordEmailResponseReadRecordEmailResult(String value) {
        return new JAXBElement<String>(_ReadRecordEmailResponseReadRecordEmailResult_QNAME, String.class, ReadRecordEmailResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "DataServerName", scope = SaveRecord.class)
    public JAXBElement<String> createSaveRecordDataServerName(String value) {
        return new JAXBElement<String>(_GetSchemaDataServerName_QNAME, String.class, SaveRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "XML", scope = SaveRecord.class)
    public JAXBElement<String> createSaveRecordXML(String value) {
    	JAXBElement<String> s = new JAXBElement<String>(_SaveRecordXML_QNAME, String.class, SaveRecord.class, value);
    
    	//System.out.println(value);
    	System.out.println("############################################################");
    	
    	/*StringResult sw = new StringResult();
    	
		
		try {
			JAXBContext context = JAXBContext.newInstance(MovMovimento.class);
			Marshaller marshaller = context.createMarshaller();
			//marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "iso-8859-15");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(s, sw);			
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}*/
		
		//System.out.println(sw.toString());
    	
        return new JAXBElement<String>(_SaveRecordXML_QNAME, String.class, SaveRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "Contexto", scope = SaveRecord.class)
    public JAXBElement<String> createSaveRecordContexto(String value) {
        return new JAXBElement<String>(_GetSchemaContexto_QNAME, String.class, SaveRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "SaveRecordResult", scope = SaveRecordResponse.class)
    public JAXBElement<String> createSaveRecordResponseSaveRecordResult(String value) {
        return new JAXBElement<String>(_SaveRecordResponseSaveRecordResult_QNAME, String.class, SaveRecordResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "DataServerName", scope = SaveRecordEmail.class)
    public JAXBElement<String> createSaveRecordEmailDataServerName(String value) {
        return new JAXBElement<String>(_GetSchemaDataServerName_QNAME, String.class, SaveRecordEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "XML", scope = SaveRecordEmail.class)
    public JAXBElement<String> createSaveRecordEmailXML(String value) {
        return new JAXBElement<String>(_SaveRecordXML_QNAME, String.class, SaveRecordEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "Contexto", scope = SaveRecordEmail.class)
    public JAXBElement<String> createSaveRecordEmailContexto(String value) {
        return new JAXBElement<String>(_GetSchemaContexto_QNAME, String.class, SaveRecordEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "EmailUsuarioContexto", scope = SaveRecordEmail.class)
    public JAXBElement<String> createSaveRecordEmailEmailUsuarioContexto(String value) {
        return new JAXBElement<String>(_GetSchemaEmailEmailUsuarioContexto_QNAME, String.class, SaveRecordEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "SaveRecordEmailResult", scope = SaveRecordEmailResponse.class)
    public JAXBElement<String> createSaveRecordEmailResponseSaveRecordEmailResult(String value) {
        return new JAXBElement<String>(_SaveRecordEmailResponseSaveRecordEmailResult_QNAME, String.class, SaveRecordEmailResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "DataServerName", scope = DeleteRecord.class)
    public JAXBElement<String> createDeleteRecordDataServerName(String value) {
        return new JAXBElement<String>(_GetSchemaDataServerName_QNAME, String.class, DeleteRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "XML", scope = DeleteRecord.class)
    public JAXBElement<String> createDeleteRecordXML(String value) {
        return new JAXBElement<String>(_SaveRecordXML_QNAME, String.class, DeleteRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "Contexto", scope = DeleteRecord.class)
    public JAXBElement<String> createDeleteRecordContexto(String value) {
        return new JAXBElement<String>(_GetSchemaContexto_QNAME, String.class, DeleteRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "DeleteRecordResult", scope = DeleteRecordResponse.class)
    public JAXBElement<String> createDeleteRecordResponseDeleteRecordResult(String value) {
        return new JAXBElement<String>(_DeleteRecordResponseDeleteRecordResult_QNAME, String.class, DeleteRecordResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "DataServerName", scope = DeleteRecordEmail.class)
    public JAXBElement<String> createDeleteRecordEmailDataServerName(String value) {
        return new JAXBElement<String>(_GetSchemaDataServerName_QNAME, String.class, DeleteRecordEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "XML", scope = DeleteRecordEmail.class)
    public JAXBElement<String> createDeleteRecordEmailXML(String value) {
        return new JAXBElement<String>(_SaveRecordXML_QNAME, String.class, DeleteRecordEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "Contexto", scope = DeleteRecordEmail.class)
    public JAXBElement<String> createDeleteRecordEmailContexto(String value) {
        return new JAXBElement<String>(_GetSchemaContexto_QNAME, String.class, DeleteRecordEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "EmailUsuarioContexto", scope = DeleteRecordEmail.class)
    public JAXBElement<String> createDeleteRecordEmailEmailUsuarioContexto(String value) {
        return new JAXBElement<String>(_GetSchemaEmailEmailUsuarioContexto_QNAME, String.class, DeleteRecordEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "DeleteRecordEmailResult", scope = DeleteRecordEmailResponse.class)
    public JAXBElement<String> createDeleteRecordEmailResponseDeleteRecordEmailResult(String value) {
        return new JAXBElement<String>(_DeleteRecordEmailResponseDeleteRecordEmailResult_QNAME, String.class, DeleteRecordEmailResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "DataServerName", scope = DeleteRecordByKey.class)
    public JAXBElement<String> createDeleteRecordByKeyDataServerName(String value) {
        return new JAXBElement<String>(_GetSchemaDataServerName_QNAME, String.class, DeleteRecordByKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "PrimaryKey", scope = DeleteRecordByKey.class)
    public JAXBElement<String> createDeleteRecordByKeyPrimaryKey(String value) {
        return new JAXBElement<String>(_ReadRecordPrimaryKey_QNAME, String.class, DeleteRecordByKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "Contexto", scope = DeleteRecordByKey.class)
    public JAXBElement<String> createDeleteRecordByKeyContexto(String value) {
        return new JAXBElement<String>(_GetSchemaContexto_QNAME, String.class, DeleteRecordByKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "DeleteRecordByKeyResult", scope = DeleteRecordByKeyResponse.class)
    public JAXBElement<String> createDeleteRecordByKeyResponseDeleteRecordByKeyResult(String value) {
        return new JAXBElement<String>(_DeleteRecordByKeyResponseDeleteRecordByKeyResult_QNAME, String.class, DeleteRecordByKeyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "DataServerName", scope = ReadLookupView.class)
    public JAXBElement<String> createReadLookupViewDataServerName(String value) {
        return new JAXBElement<String>(_GetSchemaDataServerName_QNAME, String.class, ReadLookupView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "Filtro", scope = ReadLookupView.class)
    public JAXBElement<String> createReadLookupViewFiltro(String value) {
        return new JAXBElement<String>(_ReadViewFiltro_QNAME, String.class, ReadLookupView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "Contexto", scope = ReadLookupView.class)
    public JAXBElement<String> createReadLookupViewContexto(String value) {
        return new JAXBElement<String>(_GetSchemaContexto_QNAME, String.class, ReadLookupView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "OwnerData", scope = ReadLookupView.class)
    public JAXBElement<String> createReadLookupViewOwnerData(String value) {
        return new JAXBElement<String>(_ReadLookupViewOwnerData_QNAME, String.class, ReadLookupView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "ReadLookupViewResult", scope = ReadLookupViewResponse.class)
    public JAXBElement<String> createReadLookupViewResponseReadLookupViewResult(String value) {
        return new JAXBElement<String>(_ReadLookupViewResponseReadLookupViewResult_QNAME, String.class, ReadLookupViewResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "DataServerName", scope = ReadLookupViewEmail.class)
    public JAXBElement<String> createReadLookupViewEmailDataServerName(String value) {
        return new JAXBElement<String>(_GetSchemaDataServerName_QNAME, String.class, ReadLookupViewEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "Filtro", scope = ReadLookupViewEmail.class)
    public JAXBElement<String> createReadLookupViewEmailFiltro(String value) {
        return new JAXBElement<String>(_ReadViewFiltro_QNAME, String.class, ReadLookupViewEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "Contexto", scope = ReadLookupViewEmail.class)
    public JAXBElement<String> createReadLookupViewEmailContexto(String value) {
        return new JAXBElement<String>(_GetSchemaContexto_QNAME, String.class, ReadLookupViewEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "OwnerData", scope = ReadLookupViewEmail.class)
    public JAXBElement<String> createReadLookupViewEmailOwnerData(String value) {
        return new JAXBElement<String>(_ReadLookupViewOwnerData_QNAME, String.class, ReadLookupViewEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "EmailUsuarioContexto", scope = ReadLookupViewEmail.class)
    public JAXBElement<String> createReadLookupViewEmailEmailUsuarioContexto(String value) {
        return new JAXBElement<String>(_GetSchemaEmailEmailUsuarioContexto_QNAME, String.class, ReadLookupViewEmail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.totvs.com/", name = "ReadLookupViewEmailResult", scope = ReadLookupViewEmailResponse.class)
    public JAXBElement<String> createReadLookupViewEmailResponseReadLookupViewEmailResult(String value) {
        return new JAXBElement<String>(_ReadLookupViewEmailResponseReadLookupViewEmailResult_QNAME, String.class, ReadLookupViewEmailResponse.class, value);
    }

}
