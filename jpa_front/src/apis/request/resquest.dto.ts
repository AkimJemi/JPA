import { ResponseCode } from 'types/enum';

export default interface RequestDto {
    code: ResponseCode;
    message: string;
}