/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#ifndef user_profile_model_TYPES_H
#define user_profile_model_TYPES_H

#include <iosfwd>

#include <thrift/Thrift.h>
#include <thrift/TApplicationException.h>
#include <thrift/TBase.h>
#include <thrift/protocol/TProtocol.h>
#include <thrift/transport/TTransport.h>

#include <thrift/cxxfunctional.h>
#include "airavata_commons_types.h"


namespace apache { namespace airavata { namespace model { namespace user {

struct Status {
  enum type {
    ACTIVE = 0,
    CONFIRMED = 1,
    APPROVED = 2,
    DELETED = 3,
    DUPLICATE = 4,
    GRACE_PERIOD = 5,
    INVITED = 6,
    DENIED = 7,
    PENDING = 8,
    PENDING_APPROVAL = 9,
    PENDING_CONFIRMATION = 10,
    SUSPENDED = 11,
    DECLINED = 12,
    EXPIRED = 13
  };
};

extern const std::map<int, const char*> _Status_VALUES_TO_NAMES;

struct USCitizenship {
  enum type {
    US_CITIZEN = 0,
    US_PERMANENT_RESIDENT = 1,
    OTHER_NON_US_CITIZEN = 2
  };
};

extern const std::map<int, const char*> _USCitizenship_VALUES_TO_NAMES;

struct ethnicity {
  enum type {
    HISPANIC_LATINO = 0,
    NOT_HISPANIC_LATINO = 1
  };
};

extern const std::map<int, const char*> _ethnicity_VALUES_TO_NAMES;

struct race {
  enum type {
    ASIAN = 0,
    AMERICAN_INDIAN_OR_ALASKAN_NATIVE = 1,
    BLACK_OR_AFRICAN_AMERICAN = 2,
    NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER = 3,
    WHITE = 4
  };
};

extern const std::map<int, const char*> _race_VALUES_TO_NAMES;

struct disability {
  enum type {
    HEARING_IMAPAIRED = 0,
    VISUAL_IMPAIRED = 1,
    MOBILITY_OR_ORTHOPEDIC_IMPAIRMENT = 2,
    OTHER_IMPAIRMENT = 3
  };
};

extern const std::map<int, const char*> _disability_VALUES_TO_NAMES;

class NSFDemographics;

class CustomDashboard;

class UserProfile;

typedef struct _NSFDemographics__isset {
  _NSFDemographics__isset() : gender(false), usCitizenship(false), ethnicities(false), races(false), disabilities(false) {}
  bool gender :1;
  bool usCitizenship :1;
  bool ethnicities :1;
  bool races :1;
  bool disabilities :1;
} _NSFDemographics__isset;

class NSFDemographics : public virtual ::apache::thrift::TBase {
 public:

  NSFDemographics(const NSFDemographics&);
  NSFDemographics& operator=(const NSFDemographics&);
  NSFDemographics() : airavataInternalUserId("DO_NOT_SET_AT_CLIENTS"), gender(), usCitizenship((USCitizenship::type)0) {
  }

  virtual ~NSFDemographics() throw();
  std::string airavataInternalUserId;
  std::string gender;
  USCitizenship::type usCitizenship;
  std::vector<ethnicity::type>  ethnicities;
  std::vector<race::type>  races;
  std::vector<disability::type>  disabilities;

  _NSFDemographics__isset __isset;

  void __set_airavataInternalUserId(const std::string& val);

  void __set_gender(const std::string& val);

  void __set_usCitizenship(const USCitizenship::type val);

  void __set_ethnicities(const std::vector<ethnicity::type> & val);

  void __set_races(const std::vector<race::type> & val);

  void __set_disabilities(const std::vector<disability::type> & val);

  bool operator == (const NSFDemographics & rhs) const
  {
    if (!(airavataInternalUserId == rhs.airavataInternalUserId))
      return false;
    if (__isset.gender != rhs.__isset.gender)
      return false;
    else if (__isset.gender && !(gender == rhs.gender))
      return false;
    if (__isset.usCitizenship != rhs.__isset.usCitizenship)
      return false;
    else if (__isset.usCitizenship && !(usCitizenship == rhs.usCitizenship))
      return false;
    if (__isset.ethnicities != rhs.__isset.ethnicities)
      return false;
    else if (__isset.ethnicities && !(ethnicities == rhs.ethnicities))
      return false;
    if (__isset.races != rhs.__isset.races)
      return false;
    else if (__isset.races && !(races == rhs.races))
      return false;
    if (__isset.disabilities != rhs.__isset.disabilities)
      return false;
    else if (__isset.disabilities && !(disabilities == rhs.disabilities))
      return false;
    return true;
  }
  bool operator != (const NSFDemographics &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const NSFDemographics & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  virtual void printTo(std::ostream& out) const;
};

void swap(NSFDemographics &a, NSFDemographics &b);

inline std::ostream& operator<<(std::ostream& out, const NSFDemographics& obj)
{
  obj.printTo(out);
  return out;
}

typedef struct _CustomDashboard__isset {
  _CustomDashboard__isset() : experimentId(false), name(false), description(false), project(false), owner(false), application(false), computeResource(false), jobName(false), jobId(false), jobStatus(false), jobCreationTime(false), notificationsTo(false), workingDir(false), jobDescription(false), creationTime(false), lastModifiedTime(false), wallTime(false), cpuCount(false), nodeCount(false), queue(false), inputs(false), outputs(false), storageDir(false), errors(false) {}
  bool experimentId :1;
  bool name :1;
  bool description :1;
  bool project :1;
  bool owner :1;
  bool application :1;
  bool computeResource :1;
  bool jobName :1;
  bool jobId :1;
  bool jobStatus :1;
  bool jobCreationTime :1;
  bool notificationsTo :1;
  bool workingDir :1;
  bool jobDescription :1;
  bool creationTime :1;
  bool lastModifiedTime :1;
  bool wallTime :1;
  bool cpuCount :1;
  bool nodeCount :1;
  bool queue :1;
  bool inputs :1;
  bool outputs :1;
  bool storageDir :1;
  bool errors :1;
} _CustomDashboard__isset;

class CustomDashboard : public virtual ::apache::thrift::TBase {
 public:

  CustomDashboard(const CustomDashboard&);
  CustomDashboard& operator=(const CustomDashboard&);
  CustomDashboard() : airavataInternalUserId("DO_NOT_SET_AT_CLIENTS"), experimentId(), name(), description(), project(), owner(), application(), computeResource(), jobName(), jobId(), jobStatus(), jobCreationTime(), notificationsTo(), workingDir(), jobDescription(), creationTime(), lastModifiedTime(), wallTime(), cpuCount(), nodeCount(), queue(), inputs(), outputs(), storageDir(), errors() {
  }

  virtual ~CustomDashboard() throw();
  std::string airavataInternalUserId;
  std::string experimentId;
  std::string name;
  std::string description;
  std::string project;
  std::string owner;
  std::string application;
  std::string computeResource;
  std::string jobName;
  std::string jobId;
  std::string jobStatus;
  std::string jobCreationTime;
  std::string notificationsTo;
  std::string workingDir;
  std::string jobDescription;
  std::string creationTime;
  std::string lastModifiedTime;
  std::string wallTime;
  std::string cpuCount;
  std::string nodeCount;
  std::string queue;
  std::string inputs;
  std::string outputs;
  std::string storageDir;
  std::string errors;

  _CustomDashboard__isset __isset;

  void __set_airavataInternalUserId(const std::string& val);

  void __set_experimentId(const std::string& val);

  void __set_name(const std::string& val);

  void __set_description(const std::string& val);

  void __set_project(const std::string& val);

  void __set_owner(const std::string& val);

  void __set_application(const std::string& val);

  void __set_computeResource(const std::string& val);

  void __set_jobName(const std::string& val);

  void __set_jobId(const std::string& val);

  void __set_jobStatus(const std::string& val);

  void __set_jobCreationTime(const std::string& val);

  void __set_notificationsTo(const std::string& val);

  void __set_workingDir(const std::string& val);

  void __set_jobDescription(const std::string& val);

  void __set_creationTime(const std::string& val);

  void __set_lastModifiedTime(const std::string& val);

  void __set_wallTime(const std::string& val);

  void __set_cpuCount(const std::string& val);

  void __set_nodeCount(const std::string& val);

  void __set_queue(const std::string& val);

  void __set_inputs(const std::string& val);

  void __set_outputs(const std::string& val);

  void __set_storageDir(const std::string& val);

  void __set_errors(const std::string& val);

  bool operator == (const CustomDashboard & rhs) const
  {
    if (!(airavataInternalUserId == rhs.airavataInternalUserId))
      return false;
    if (__isset.experimentId != rhs.__isset.experimentId)
      return false;
    else if (__isset.experimentId && !(experimentId == rhs.experimentId))
      return false;
    if (__isset.name != rhs.__isset.name)
      return false;
    else if (__isset.name && !(name == rhs.name))
      return false;
    if (__isset.description != rhs.__isset.description)
      return false;
    else if (__isset.description && !(description == rhs.description))
      return false;
    if (__isset.project != rhs.__isset.project)
      return false;
    else if (__isset.project && !(project == rhs.project))
      return false;
    if (__isset.owner != rhs.__isset.owner)
      return false;
    else if (__isset.owner && !(owner == rhs.owner))
      return false;
    if (__isset.application != rhs.__isset.application)
      return false;
    else if (__isset.application && !(application == rhs.application))
      return false;
    if (__isset.computeResource != rhs.__isset.computeResource)
      return false;
    else if (__isset.computeResource && !(computeResource == rhs.computeResource))
      return false;
    if (__isset.jobName != rhs.__isset.jobName)
      return false;
    else if (__isset.jobName && !(jobName == rhs.jobName))
      return false;
    if (__isset.jobId != rhs.__isset.jobId)
      return false;
    else if (__isset.jobId && !(jobId == rhs.jobId))
      return false;
    if (__isset.jobStatus != rhs.__isset.jobStatus)
      return false;
    else if (__isset.jobStatus && !(jobStatus == rhs.jobStatus))
      return false;
    if (__isset.jobCreationTime != rhs.__isset.jobCreationTime)
      return false;
    else if (__isset.jobCreationTime && !(jobCreationTime == rhs.jobCreationTime))
      return false;
    if (__isset.notificationsTo != rhs.__isset.notificationsTo)
      return false;
    else if (__isset.notificationsTo && !(notificationsTo == rhs.notificationsTo))
      return false;
    if (__isset.workingDir != rhs.__isset.workingDir)
      return false;
    else if (__isset.workingDir && !(workingDir == rhs.workingDir))
      return false;
    if (__isset.jobDescription != rhs.__isset.jobDescription)
      return false;
    else if (__isset.jobDescription && !(jobDescription == rhs.jobDescription))
      return false;
    if (__isset.creationTime != rhs.__isset.creationTime)
      return false;
    else if (__isset.creationTime && !(creationTime == rhs.creationTime))
      return false;
    if (__isset.lastModifiedTime != rhs.__isset.lastModifiedTime)
      return false;
    else if (__isset.lastModifiedTime && !(lastModifiedTime == rhs.lastModifiedTime))
      return false;
    if (__isset.wallTime != rhs.__isset.wallTime)
      return false;
    else if (__isset.wallTime && !(wallTime == rhs.wallTime))
      return false;
    if (__isset.cpuCount != rhs.__isset.cpuCount)
      return false;
    else if (__isset.cpuCount && !(cpuCount == rhs.cpuCount))
      return false;
    if (__isset.nodeCount != rhs.__isset.nodeCount)
      return false;
    else if (__isset.nodeCount && !(nodeCount == rhs.nodeCount))
      return false;
    if (__isset.queue != rhs.__isset.queue)
      return false;
    else if (__isset.queue && !(queue == rhs.queue))
      return false;
    if (__isset.inputs != rhs.__isset.inputs)
      return false;
    else if (__isset.inputs && !(inputs == rhs.inputs))
      return false;
    if (__isset.outputs != rhs.__isset.outputs)
      return false;
    else if (__isset.outputs && !(outputs == rhs.outputs))
      return false;
    if (__isset.storageDir != rhs.__isset.storageDir)
      return false;
    else if (__isset.storageDir && !(storageDir == rhs.storageDir))
      return false;
    if (__isset.errors != rhs.__isset.errors)
      return false;
    else if (__isset.errors && !(errors == rhs.errors))
      return false;
    return true;
  }
  bool operator != (const CustomDashboard &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const CustomDashboard & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  virtual void printTo(std::ostream& out) const;
};

void swap(CustomDashboard &a, CustomDashboard &b);

inline std::ostream& operator<<(std::ostream& out, const CustomDashboard& obj)
{
  obj.printTo(out);
  return out;
}

typedef struct _UserProfile__isset {
  _UserProfile__isset() : middleName(false), namePrefix(false), nameSuffix(false), orcidId(false), phones(false), country(false), nationality(false), homeOrganization(false), orginationAffiliation(false), comments(false), labeledURI(false), gpgKey(false), timeZone(false), nsfDemographics(false), customDashboard(false) {}
  bool middleName :1;
  bool namePrefix :1;
  bool nameSuffix :1;
  bool orcidId :1;
  bool phones :1;
  bool country :1;
  bool nationality :1;
  bool homeOrganization :1;
  bool orginationAffiliation :1;
  bool comments :1;
  bool labeledURI :1;
  bool gpgKey :1;
  bool timeZone :1;
  bool nsfDemographics :1;
  bool customDashboard :1;
} _UserProfile__isset;

class UserProfile : public virtual ::apache::thrift::TBase {
 public:

  UserProfile(const UserProfile&);
  UserProfile& operator=(const UserProfile&);
  UserProfile() : userModelVersion("1.0"), airavataInternalUserId("DO_NOT_SET_AT_CLIENTS"), userId(), gatewayId(), firstName(), lastName(), middleName(), namePrefix(), nameSuffix(), orcidId(), country(), homeOrganization(), orginationAffiliation(), creationTime(0), lastAccessTime(0), validUntil(0), State((Status::type)0), comments(), gpgKey(), timeZone() {
  }

  virtual ~UserProfile() throw();
  std::string userModelVersion;
  std::string airavataInternalUserId;
  std::string userId;
  std::string gatewayId;
  std::vector<std::string>  emails;
  std::string firstName;
  std::string lastName;
  std::string middleName;
  std::string namePrefix;
  std::string nameSuffix;
  std::string orcidId;
  std::vector<std::string>  phones;
  std::string country;
  std::vector<std::string>  nationality;
  std::string homeOrganization;
  std::string orginationAffiliation;
  int64_t creationTime;
  int64_t lastAccessTime;
  int64_t validUntil;
  Status::type State;
  std::string comments;
  std::vector<std::string>  labeledURI;
  std::string gpgKey;
  std::string timeZone;
  NSFDemographics nsfDemographics;
  CustomDashboard customDashboard;

  _UserProfile__isset __isset;

  void __set_userModelVersion(const std::string& val);

  void __set_airavataInternalUserId(const std::string& val);

  void __set_userId(const std::string& val);

  void __set_gatewayId(const std::string& val);

  void __set_emails(const std::vector<std::string> & val);

  void __set_firstName(const std::string& val);

  void __set_lastName(const std::string& val);

  void __set_middleName(const std::string& val);

  void __set_namePrefix(const std::string& val);

  void __set_nameSuffix(const std::string& val);

  void __set_orcidId(const std::string& val);

  void __set_phones(const std::vector<std::string> & val);

  void __set_country(const std::string& val);

  void __set_nationality(const std::vector<std::string> & val);

  void __set_homeOrganization(const std::string& val);

  void __set_orginationAffiliation(const std::string& val);

  void __set_creationTime(const int64_t val);

  void __set_lastAccessTime(const int64_t val);

  void __set_validUntil(const int64_t val);

  void __set_State(const Status::type val);

  void __set_comments(const std::string& val);

  void __set_labeledURI(const std::vector<std::string> & val);

  void __set_gpgKey(const std::string& val);

  void __set_timeZone(const std::string& val);

  void __set_nsfDemographics(const NSFDemographics& val);

  void __set_customDashboard(const CustomDashboard& val);

  bool operator == (const UserProfile & rhs) const
  {
    if (!(userModelVersion == rhs.userModelVersion))
      return false;
    if (!(airavataInternalUserId == rhs.airavataInternalUserId))
      return false;
    if (!(userId == rhs.userId))
      return false;
    if (!(gatewayId == rhs.gatewayId))
      return false;
    if (!(emails == rhs.emails))
      return false;
    if (!(firstName == rhs.firstName))
      return false;
    if (!(lastName == rhs.lastName))
      return false;
    if (__isset.middleName != rhs.__isset.middleName)
      return false;
    else if (__isset.middleName && !(middleName == rhs.middleName))
      return false;
    if (__isset.namePrefix != rhs.__isset.namePrefix)
      return false;
    else if (__isset.namePrefix && !(namePrefix == rhs.namePrefix))
      return false;
    if (__isset.nameSuffix != rhs.__isset.nameSuffix)
      return false;
    else if (__isset.nameSuffix && !(nameSuffix == rhs.nameSuffix))
      return false;
    if (__isset.orcidId != rhs.__isset.orcidId)
      return false;
    else if (__isset.orcidId && !(orcidId == rhs.orcidId))
      return false;
    if (__isset.phones != rhs.__isset.phones)
      return false;
    else if (__isset.phones && !(phones == rhs.phones))
      return false;
    if (__isset.country != rhs.__isset.country)
      return false;
    else if (__isset.country && !(country == rhs.country))
      return false;
    if (__isset.nationality != rhs.__isset.nationality)
      return false;
    else if (__isset.nationality && !(nationality == rhs.nationality))
      return false;
    if (__isset.homeOrganization != rhs.__isset.homeOrganization)
      return false;
    else if (__isset.homeOrganization && !(homeOrganization == rhs.homeOrganization))
      return false;
    if (__isset.orginationAffiliation != rhs.__isset.orginationAffiliation)
      return false;
    else if (__isset.orginationAffiliation && !(orginationAffiliation == rhs.orginationAffiliation))
      return false;
    if (!(creationTime == rhs.creationTime))
      return false;
    if (!(lastAccessTime == rhs.lastAccessTime))
      return false;
    if (!(validUntil == rhs.validUntil))
      return false;
    if (!(State == rhs.State))
      return false;
    if (__isset.comments != rhs.__isset.comments)
      return false;
    else if (__isset.comments && !(comments == rhs.comments))
      return false;
    if (__isset.labeledURI != rhs.__isset.labeledURI)
      return false;
    else if (__isset.labeledURI && !(labeledURI == rhs.labeledURI))
      return false;
    if (__isset.gpgKey != rhs.__isset.gpgKey)
      return false;
    else if (__isset.gpgKey && !(gpgKey == rhs.gpgKey))
      return false;
    if (__isset.timeZone != rhs.__isset.timeZone)
      return false;
    else if (__isset.timeZone && !(timeZone == rhs.timeZone))
      return false;
    if (__isset.nsfDemographics != rhs.__isset.nsfDemographics)
      return false;
    else if (__isset.nsfDemographics && !(nsfDemographics == rhs.nsfDemographics))
      return false;
    if (__isset.customDashboard != rhs.__isset.customDashboard)
      return false;
    else if (__isset.customDashboard && !(customDashboard == rhs.customDashboard))
      return false;
    return true;
  }
  bool operator != (const UserProfile &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const UserProfile & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  virtual void printTo(std::ostream& out) const;
};

void swap(UserProfile &a, UserProfile &b);

inline std::ostream& operator<<(std::ostream& out, const UserProfile& obj)
{
  obj.printTo(out);
  return out;
}

}}}} // namespace

#endif