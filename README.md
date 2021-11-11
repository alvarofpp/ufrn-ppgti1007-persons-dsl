# PPGTI1007 - Persons language

This work has as purpose to create a DSL (Domain-Specific Languages) to save persons data in a XML file. I was inspired by [JSON syntax](https://www.json.org/json-en.html).

Work of Domain-Specific Languages (PPGTI1007) course of Master's degree in Information Technology from the Federal University of Rio Grande do Norte (UFRN), with [Sergio Queiroz de Medeiros](https://docente.ufrn.br/201900341664/perfil) as professor.

# Domain-Specific Language

## Grammar

```xtext
grammar org.ppgti.persondsl.PersonDsl with org.eclipse.xtext.common.Terminals

generate personDsl "http://www.ppgti.org/persondsl/PersonDsl"

Persons:
    persons+=Person*
;

Person:
    'person' cpf=ValidID '{' ((attributes+=Attribute) (',' attributes+=Attribute)*)? '}'
;

ValidID:
    ID | Cpf
;

Cpf:
    INT'.'INT'.'INT'-'INT
;

Attribute:
    key=STRING ':' value=Value
;

Value:
    INT | STRING | ANY_OTHER | Date | Boolean
;

Date:
    INT'/'INT'/'INT
;

Boolean:
    'true' | 'false'
;
```

## Use

```json
person {cpf} {
    "{attribute_key}": {attribute_value},
    "{another_attribute_key}": {another_attribute_value}
}
```

## Example

### Input

```json
person 111.111.111-11 {
    "fullname": "Alvaro Ferreira Pires de Paiva",
    "birthday": 25/07/1997
}

person 222.222.222-22 {
    "fullname": "Rebeka Ferraz Cavalcante",
    "birthday": 24/12/1998
}
```

### Output

```xml
<persons>
  <person id="111.111.111-11">
    <fullname>"Alvaro Ferreira Pires de Paiva"</fullname>
    <birthday>25/07/1997</birthday>
  </person>
  <person id="222.222.222-22">
    <fullname>"Rebeka Ferraz Cavalcante"</fullname>
    <birthday>24/12/1998</birthday>
  </person>
</persons>
```

