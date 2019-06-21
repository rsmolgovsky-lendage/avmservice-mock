#!/usr/bin/env bash

circleci namespace create circleci-test github sindeo

circleci namespace create rsmolgovsky-circleci github rsmolgovsky-lendage

circleci orb validate orbs/test-orb.yml

circleci orb create rsmolgovsky-circleci/test-orb

circleci orb publish orbs/test-orb.yml rsmolgovsky-circleci/test-orb@dev:1


circleci orb validate orbs/lendage-gke-orb.yml

circleci orb create rsmolgovsky-circleci/lengdage-gke

circleci orb publish orbs/lendage-gke-orb.yml rsmolgovsky-circleci/lengdage-gke@dev:1
