There may be a port based error.
That scenario can be seen in report here
https://bugs.eclipse.org/bugs/show_bug.cgi?id=235821 and is caused by a
discrepancy between the WSDL schema and the JWSDL/WSDL4J version used by the
WSDL validator.
Upgrade WSDL validator version to fix it.