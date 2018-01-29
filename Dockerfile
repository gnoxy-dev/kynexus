from jboss/wildfly:11.0.0.Final

COPY maven/kynexus-1.0-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/kynexus.war

LABEL com.gnoxy.tpsw="true", com.gnoxy.maintainer="gnoxy <dev@gnoxy.com>", com.gnoxy.base-image="jboss/wildfly:11.0.0.Final"

