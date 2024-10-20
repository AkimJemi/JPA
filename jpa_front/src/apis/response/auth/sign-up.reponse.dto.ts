import ResponseDto from '../response.dto';
export default interface SignUpResponseDto extends ResponseDto {
    email: string;
    password: string;
}