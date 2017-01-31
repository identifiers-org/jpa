/* collections */
INSERT INTO mir_datatype (datatype_id, name, pattern, definition, date_creation, date_modif, obsolete, obsolete_comment, replacement, restriction, prefixed_id) VALUES ('MIR:00000001', 'BIND', '^\\d+$', 'BIND is a database of protein-protein interactions. This data-resource is not open-access.', '2006-08-14 19:38:06', '2012-06-08 14:51:32', 1, 'BIND doesn''t exist any more and its successor (BOND) is not open-access. Bulk downloads of BIND data (http://bond.unleashedinformatics.com/downloads/data/BIND/data/datasets/taxon/xml/) and a PSI-MI 2.5 translation (http://download.baderlab.org/BINDTranslation/) are available.', 'MIR:00000010', 1, 0);
INSERT INTO mir_datatype (datatype_id, name, pattern, definition, date_creation, date_modif, obsolete, obsolete_comment, replacement, restriction, prefixed_id) VALUES ('MIR:00000002', 'ChEBI', '^CHEBI:\\d+$', 'Chemical Entities of Biological Interest (ChEBI) is a freely available dictionary of molecular entities focused on ''small'' chemical compounds.', '2006-08-14 19:38:06', '2016-05-13 19:25:21', 0, '', '', 0, 1);
INSERT INTO mir_datatype (datatype_id, name, pattern, definition, date_creation, date_modif, obsolete, obsolete_comment, replacement, restriction, prefixed_id) VALUES ('MIR:00000005', 'UniProt Knowledgebase', '^([A-N,R-Z][0-9]([A-Z][A-Z, 0-9][A-Z, 0-9][0-9]){1,2})|([O,P,Q][0-9][A-Z, 0-9][A-Z, 0-9][A-Z, 0-9][0-9])(\\.\\d+)?$', 'The UniProt Knowledgebase (UniProtKB) is a comprehensive resource for protein sequence and functional information with extensive cross-references to more than 120 external databases. Besides amino acid sequence and a description, it also provides taxonomic data and citation information.', '2006-08-14 19:38:06', '2015-12-16 09:55:11', 0, '', '', 0, 0);
INSERT INTO mir_datatype (datatype_id, name, pattern, definition, date_creation, date_modif, obsolete, obsolete_comment, replacement, restriction, prefixed_id) VALUES ('MIR:00000006', 'Taxonomy', '^\\d+$', 'The taxonomy contains the relationships between all living forms for which nucleic acid or protein sequence have been determined.', '2006-08-14 19:38:06', '2016-08-24 11:12:17', 0, '', '', 0, 0);
INSERT INTO mir_datatype (datatype_id, name, pattern, definition, date_creation, date_modif, obsolete, obsolete_comment, replacement, restriction, prefixed_id) VALUES ('MIR:00000015', 'PubMed', '^\\d+$', 'PubMed is a service of the U.S. National Library of Medicine that includes citations from MEDLINE and other life science journals for biomedical articles back to the 1950s.', '2006-08-14 19:38:06', '2016-01-14 10:17:29', 0, '', '', 0, 0);

/* resources */
/* chebi */
INSERT INTO mir_resource (resource_id, url_element_prefix, url_element_suffix, url_resource, info, institution, location, example, official, obsolete, frame_deny, ptr_datatype, convertPrefix) VALUES ('MIR:00100009', 'http://www.ebi.ac.uk/chebi/searchId.do?chebiId=', '', 'http://www.ebi.ac.uk/chebi/', 'ChEBI (Chemical Entities of Biological Interest)', 'European Bioinformatics Institute, Hinxton, Cambridge', 'United Kingdom', 'CHEBI:36927', 1, 0, 0, 'MIR:00000002', 'http://www.ebi.ac.uk/chebi/searchId.do?chebiId=CHEBI:');
INSERT INTO mir_resource (resource_id, url_element_prefix, url_element_suffix, url_resource, info, institution, location, example, official, obsolete, frame_deny, ptr_datatype, convertPrefix) VALUES ('MIR:00100158', 'http://www.ebi.ac.uk/ols/ontologies/chebi/terms?obo_id=', '', 'http://www.ebi.ac.uk/ols/ontologies/chebi', 'ChEBI through OLS', 'European Bioinformatics Institute, Hinxton, Cambridge', 'UK', 'CHEBI:36927', 0, 0, 0, 'MIR:00000002', '');
INSERT INTO mir_resource (resource_id, url_element_prefix, url_element_suffix, url_resource, info, institution, location, example, official, obsolete, frame_deny, ptr_datatype, convertPrefix) VALUES ('MIR:00100565', 'http://purl.bioontology.org/ontology/CHEBI/', '', 'http://bioportal.bioontology.org/ontologies/CHEBI', 'ChEBI through BioPortal', 'National Center for Biomedical Ontology, Stanford', 'USA', 'CHEBI:36927', 0, 0, 0, 'MIR:00000002', 'http://purl.bioontology.org/ontology/CHEBI/CHEBI:');

/* pubmed */
INSERT INTO mir_resource (resource_id, url_element_prefix, url_element_suffix, url_resource, info, institution, location, example, official, obsolete, frame_deny, ptr_datatype, convertPrefix) VALUES ('MIR:00100023', 'http://www.ncbi.nlm.nih.gov/pubmed/', '', 'http://www.ncbi.nlm.nih.gov/PubMed/', 'NCBI PubMed', 'National Center for Biotechnology Information', 'USA', '16333295', 1, 0, 0, 'MIR:00000015', 'http://www.ncbi.nlm.nih.gov/pubmed/');
INSERT INTO mir_resource (resource_id, url_element_prefix, url_element_suffix, url_resource, info, institution, location, example, official, obsolete, frame_deny, ptr_datatype, convertPrefix) VALUES ('MIR:00100028', 'http://srs.ebi.ac.uk/srsbin/cgi-bin/wgetz?-view+MedlineFull+[medline-PMID:', ']', 'http://www.ebi.ac.uk/Databases/MEDLINE/medline.html', 'PubMed through SRS@EBI', 'European Bioinformatics Institute, Hinxton, Cambridge', 'United Kingdom', '16333295', 0, 1, 0, 'MIR:00000015', 'http://srs.ebi.ac.uk/srsbin/cgi-bin/wgetz?-view+MedlineFull+[medline-PMID:');
INSERT INTO mir_resource (resource_id, url_element_prefix, url_element_suffix, url_resource, info, institution, location, example, official, obsolete, frame_deny, ptr_datatype, convertPrefix) VALUES ('MIR:00100032', 'http://www.ebi.ac.uk/citexplore/citationDetails.do?dataSource=MED&externalId=', '', 'http://www.ebi.ac.uk/citexplore/', 'CiteXplore', 'European Bioinformatics Institute, Hinxton, Cambridge', 'United Kingdom', '16333295', 0, 1, 0, 'MIR:00000015', 'http://www.ebi.ac.uk/citexplore/citationDetails.do?dataSource=MED&externalId=');
INSERT INTO mir_resource (resource_id, url_element_prefix, url_element_suffix, url_resource, info, institution, location, example, official, obsolete, frame_deny, ptr_datatype, convertPrefix) VALUES ('MIR:00100064', 'http://www.hubmed.org/display.cgi?uids=', '', 'http://www.hubmed.org/', 'HubMed', 'Alfred D. Eaton', 'United Kingdom', '16333295', 0, 0, 0, 'MIR:00000015', 'http://www.hubmed.org/display.cgi?uids=');
INSERT INTO mir_resource (resource_id, url_element_prefix, url_element_suffix, url_resource, info, institution, location, example, official, obsolete, frame_deny, ptr_datatype, convertPrefix) VALUES ('MIR:00100462', 'http://ukpmc.ac.uk/abstract/MED/', '', 'http://ukpmc.ac.uk/', 'PubMed through UK PubMed Central', 'UKPMC Funders Group', 'UK', '16333295', 0, 1, 0, 'MIR:00000015', 'http://ukpmc.ac.uk/abstract/MED/');
INSERT INTO mir_resource (resource_id, url_element_prefix, url_element_suffix, url_resource, info, institution, location, example, official, obsolete, frame_deny, ptr_datatype, convertPrefix) VALUES ('MIR:00100497', 'http://europepmc.org/abstract/MED/', '', 'http://europepmc.org/', 'Europe PMC', 'Europe PubMed Central partners', 'UK', '16333295', 0, 0, 0, 'MIR:00000015', 'http://europepmc.org/abstract/MED/');
INSERT INTO mir_resource (resource_id, url_element_prefix, url_element_suffix, url_resource, info, institution, location, example, official, obsolete, frame_deny, ptr_datatype, convertPrefix) VALUES ('MIR:00100702', 'http://pubmed.bio2rdf.org/describe/?url=http://bio2rdf.org/pubmed:', '', 'http://pubmed.bio2rdf.org/fct', 'Bio2RDF', 'Bio2RDF.org', '', '23735196', 0, 0, 0, 'MIR:00000015', 'http://pubmed.bio2rdf.org/describe/?url=http://bio2rdf.org/pubmed:');
INSERT INTO mir_resource (resource_id, url_element_prefix, url_element_suffix, url_resource, info, institution, location, example, official, obsolete, frame_deny, ptr_datatype, convertPrefix) VALUES ('MIR:00100745', 'http://linkedlifedata.com/resource/pubmed/id/', '', 'http://linkedlifedata.com/', 'PubMed through Linkedlife data', 'Linkedlifedata, Ontotext, Sofia', 'Bulgaria', '23735196', 0, 0, 0, 'MIR:00000015', 'http://linkedlifedata.com/resource/pubmed/id/');

/* prefix */
INSERT INTO mir_uri (uri_id, uri, uri_type, deprecated, ptr_datatype, convertPrefix) VALUES (2605, 'http://www.ncbi.nlm.nih.gov/PubMed/', 'URL', 1, 'MIR:00000015', 'http://www.ncbi.nlm.nih.gov/PubMed/');
INSERT INTO mir_uri (uri_id, uri, uri_type, deprecated, ptr_datatype, convertPrefix) VALUES (2606, 'http://identifiers.org/pubmed/', 'URL', 0, 'MIR:00000015', 'http://identifiers.org/pubmed/');
INSERT INTO mir_uri (uri_id, uri, uri_type, deprecated, ptr_datatype, convertPrefix) VALUES (2607, 'http://bio2rdf.org/pubmed', 'URL', 2, 'MIR:00000015', 'http://bio2rdf.org/pubmed:');
INSERT INTO mir_uri (uri_id, uri, uri_type, deprecated, ptr_datatype, convertPrefix) VALUES (2608, 'urn:miriam:pubmed', 'URN', 0, 'MIR:00000015', 'urn:miriam:pubmed:');
INSERT INTO mir_uri (uri_id, uri, uri_type, deprecated, ptr_datatype, convertPrefix) VALUES (2609, 'http://linkedlifedata.com/resource/pubmed/id/', 'URL', 2, 'MIR:00000015', 'http://linkedlifedata.com/resource/pubmed/id/');
INSERT INTO mir_uri (uri_id, uri, uri_type, deprecated, ptr_datatype, convertPrefix) VALUES (2610, 'http://www.pubmed.gov/', 'URL', 1, 'MIR:00000015', 'http://www.pubmed.gov/');

/* synonyms */
INSERT INTO mir_synonym (synonym_id, name, ptr_datatype) VALUES (991, 'NEWT', 'MIR:00000006');
INSERT INTO mir_synonym (synonym_id, name, ptr_datatype) VALUES (992, 'NCBI taxonomy', 'MIR:00000006');
