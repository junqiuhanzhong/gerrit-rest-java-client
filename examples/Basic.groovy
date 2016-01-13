#!/usr/bin/env groovy

@Grab(group = 'com.urswolfer.gerrit.client.rest', module = 'gerrit-rest-java-client', version = '0.8.5')
import com.google.gerrit.extensions.api.GerritApi
import com.google.gerrit.extensions.common.ChangeInfo
import com.urswolfer.gerrit.client.rest.GerritAuthData
import com.urswolfer.gerrit.client.rest.GerritRestApiFactory

/**
 * This is a very basic example written in Groovy: http://www.groovy-lang.org
 *
 * Once you have installed Groovy, make sure this file is executable. Run it with ./Basic.groovy.
 */
GerritRestApiFactory gerritRestApiFactory = new GerritRestApiFactory();
GerritAuthData.Basic authData = new GerritAuthData.Basic("http://localhost:8080"/*, "user", "password"*/);
GerritApi gerritApi = gerritRestApiFactory.create(authData);

List<ChangeInfo> changes = gerritApi.changes().query("status:open").withLimit(10).get();
changes.each { ci ->
    printf String.format("%s %s\n", ci.changeId, ci.subject)
}
