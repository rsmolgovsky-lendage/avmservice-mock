#!/usr/bin/env bash

circleci namespace create circleci-test github sindeo

circleci namespace create rsmolgovsky-circleci github rsmolgovsky-lendage

circleci orb validate orbs/test-orb.yml

circleci orb create rsmolgovsky-circleci/test-or

circleci orb publish orbs/test-orb.yml rsmolgovsky-circleci/test-orb@dev:1
