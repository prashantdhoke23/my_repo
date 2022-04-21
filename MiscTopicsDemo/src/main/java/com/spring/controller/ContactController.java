package com.spring.controller;



import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ContactController {




@GetMapping(value="/api/contact/v1", produces=MediaType.APPLICATION_JSON_VALUE)
public Contact getContactV1() {
return new Contact("Tom", 12345);
}

@GetMapping(value="/api/contact/v2", produces=MediaType.APPLICATION_JSON_VALUE)
public ContactV2 getContact() {
return new ContactV2("Tom", 12345);
}
//Query Parameter based API
@GetMapping(value="/api/contact", produces=MediaType.APPLICATION_JSON_VALUE, params = "version=v1")
public Contact getContactQuery() {
return new Contact("Tom", 12345);
}

@GetMapping(value="/api/contact", produces=MediaType.APPLICATION_JSON_VALUE, params = "version=v2")
public ContactV2 getContactQueryV2() {
return new ContactV2("Tom", 12345);
}
@GetMapping(value="/api/contact", produces=MediaType.APPLICATION_JSON_VALUE, headers = "version=v1")
public Contact getContactHeaders() {
return new Contact("Tom", 12345);
}

@GetMapping(value="/api/contact", produces=MediaType.APPLICATION_JSON_VALUE, headers = "version=v2")
public ContactV2 getContactHeadersV2() {
return new ContactV2("Tom", 12345);
}

@GetMapping(value="/api/contact", produces="application/contact.v1+json" )
public Contact getContactContentNego() {
return new Contact("Tom", 12345);
}

@GetMapping(value="/api/contact", produces="application/contact.v2+json")
public ContactV2 getContactContentNegoV2() {
return new ContactV2("Tom", 12345);
}
}




class Contact{
public String name;
public int mobile;
public Contact(String name, int mobile) {
super();
this.name = name;
this.mobile = mobile;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getMobile() {
return mobile;
}
public void setMobile(int mobile) {
this.mobile = mobile;
}
@Override
public String toString() {
return "Contact [name=" + name + ", mobile=" + mobile + "]";
}

}



class ContactV2{
public String name;
public int mobileno;
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getMobileno() {
return mobileno;
}
public void setMobileno(int mobileno) {
this.mobileno = mobileno;
}
public ContactV2(String name, int mobileno) {
super();
this.name = name;
this.mobileno = mobileno;
}
@Override
public String toString() {
return "ContactV2 [name=" + name + ", mobileno=" + mobileno + "]";
}


}