#
# Autogenerated by Thrift Compiler (0.10.0)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#
#  options string: py
#

from thrift.Thrift import TType, TMessageType, TFrozenDict, TException, TApplicationException
from thrift.protocol.TProtocol import TProtocolException
import sys
import airavata.model.status.ttypes

from thrift.transport import TTransport


class JobModel(object):
    """
    Attributes:
     - jobId
     - taskId
     - processId
     - jobDescription
     - creationTime
     - jobStatuses
     - computeResourceConsumed
     - jobName
     - workingDir
     - stdOut
     - stdErr
     - exitCode
    """

    thrift_spec = (
        None,  # 0
        (1, TType.STRING, 'jobId', 'UTF8', None, ),  # 1
        (2, TType.STRING, 'taskId', 'UTF8', None, ),  # 2
        (3, TType.STRING, 'processId', 'UTF8', None, ),  # 3
        (4, TType.STRING, 'jobDescription', 'UTF8', None, ),  # 4
        (5, TType.I64, 'creationTime', None, None, ),  # 5
        (6, TType.LIST, 'jobStatuses', (TType.STRUCT, (airavata.model.status.ttypes.JobStatus, airavata.model.status.ttypes.JobStatus.thrift_spec), False), None, ),  # 6
        (7, TType.STRING, 'computeResourceConsumed', 'UTF8', None, ),  # 7
        (8, TType.STRING, 'jobName', 'UTF8', None, ),  # 8
        (9, TType.STRING, 'workingDir', 'UTF8', None, ),  # 9
        (10, TType.STRING, 'stdOut', 'UTF8', None, ),  # 10
        (11, TType.STRING, 'stdErr', 'UTF8', None, ),  # 11
        (12, TType.I32, 'exitCode', None, None, ),  # 12
    )

    def __init__(self, jobId=None, taskId=None, processId=None, jobDescription=None, creationTime=None, jobStatuses=None, computeResourceConsumed=None, jobName=None, workingDir=None, stdOut=None, stdErr=None, exitCode=None,):
        self.jobId = jobId
        self.taskId = taskId
        self.processId = processId
        self.jobDescription = jobDescription
        self.creationTime = creationTime
        self.jobStatuses = jobStatuses
        self.computeResourceConsumed = computeResourceConsumed
        self.jobName = jobName
        self.workingDir = workingDir
        self.stdOut = stdOut
        self.stdErr = stdErr
        self.exitCode = exitCode

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, (self.__class__, self.thrift_spec))
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.STRING:
                    self.jobId = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 2:
                if ftype == TType.STRING:
                    self.taskId = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 3:
                if ftype == TType.STRING:
                    self.processId = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 4:
                if ftype == TType.STRING:
                    self.jobDescription = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 5:
                if ftype == TType.I64:
                    self.creationTime = iprot.readI64()
                else:
                    iprot.skip(ftype)
            elif fid == 6:
                if ftype == TType.LIST:
                    self.jobStatuses = []
                    (_etype3, _size0) = iprot.readListBegin()
                    for _i4 in range(_size0):
                        _elem5 = airavata.model.status.ttypes.JobStatus()
                        _elem5.read(iprot)
                        self.jobStatuses.append(_elem5)
                    iprot.readListEnd()
                else:
                    iprot.skip(ftype)
            elif fid == 7:
                if ftype == TType.STRING:
                    self.computeResourceConsumed = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 8:
                if ftype == TType.STRING:
                    self.jobName = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 9:
                if ftype == TType.STRING:
                    self.workingDir = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 10:
                if ftype == TType.STRING:
                    self.stdOut = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 11:
                if ftype == TType.STRING:
                    self.stdErr = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 12:
                if ftype == TType.I32:
                    self.exitCode = iprot.readI32()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, (self.__class__, self.thrift_spec)))
            return
        oprot.writeStructBegin('JobModel')
        if self.jobId is not None:
            oprot.writeFieldBegin('jobId', TType.STRING, 1)
            oprot.writeString(self.jobId.encode('utf-8') if sys.version_info[0] == 2 else self.jobId)
            oprot.writeFieldEnd()
        if self.taskId is not None:
            oprot.writeFieldBegin('taskId', TType.STRING, 2)
            oprot.writeString(self.taskId.encode('utf-8') if sys.version_info[0] == 2 else self.taskId)
            oprot.writeFieldEnd()
        if self.processId is not None:
            oprot.writeFieldBegin('processId', TType.STRING, 3)
            oprot.writeString(self.processId.encode('utf-8') if sys.version_info[0] == 2 else self.processId)
            oprot.writeFieldEnd()
        if self.jobDescription is not None:
            oprot.writeFieldBegin('jobDescription', TType.STRING, 4)
            oprot.writeString(self.jobDescription.encode('utf-8') if sys.version_info[0] == 2 else self.jobDescription)
            oprot.writeFieldEnd()
        if self.creationTime is not None:
            oprot.writeFieldBegin('creationTime', TType.I64, 5)
            oprot.writeI64(self.creationTime)
            oprot.writeFieldEnd()
        if self.jobStatuses is not None:
            oprot.writeFieldBegin('jobStatuses', TType.LIST, 6)
            oprot.writeListBegin(TType.STRUCT, len(self.jobStatuses))
            for iter6 in self.jobStatuses:
                iter6.write(oprot)
            oprot.writeListEnd()
            oprot.writeFieldEnd()
        if self.computeResourceConsumed is not None:
            oprot.writeFieldBegin('computeResourceConsumed', TType.STRING, 7)
            oprot.writeString(self.computeResourceConsumed.encode('utf-8') if sys.version_info[0] == 2 else self.computeResourceConsumed)
            oprot.writeFieldEnd()
        if self.jobName is not None:
            oprot.writeFieldBegin('jobName', TType.STRING, 8)
            oprot.writeString(self.jobName.encode('utf-8') if sys.version_info[0] == 2 else self.jobName)
            oprot.writeFieldEnd()
        if self.workingDir is not None:
            oprot.writeFieldBegin('workingDir', TType.STRING, 9)
            oprot.writeString(self.workingDir.encode('utf-8') if sys.version_info[0] == 2 else self.workingDir)
            oprot.writeFieldEnd()
        if self.stdOut is not None:
            oprot.writeFieldBegin('stdOut', TType.STRING, 10)
            oprot.writeString(self.stdOut.encode('utf-8') if sys.version_info[0] == 2 else self.stdOut)
            oprot.writeFieldEnd()
        if self.stdErr is not None:
            oprot.writeFieldBegin('stdErr', TType.STRING, 11)
            oprot.writeString(self.stdErr.encode('utf-8') if sys.version_info[0] == 2 else self.stdErr)
            oprot.writeFieldEnd()
        if self.exitCode is not None:
            oprot.writeFieldBegin('exitCode', TType.I32, 12)
            oprot.writeI32(self.exitCode)
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        if self.jobId is None:
            raise TProtocolException(message='Required field jobId is unset!')
        if self.taskId is None:
            raise TProtocolException(message='Required field taskId is unset!')
        if self.processId is None:
            raise TProtocolException(message='Required field processId is unset!')
        if self.jobDescription is None:
            raise TProtocolException(message='Required field jobDescription is unset!')
        return

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)
