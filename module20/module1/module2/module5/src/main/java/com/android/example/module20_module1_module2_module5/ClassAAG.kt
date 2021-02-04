package com.android.example.module20_module1_module2_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module06_module353_module2.ClassAAF = com.android.example.module06_module353_module2.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module06_module353_module2.ClassAAA = com.android.example.module06_module353_module2.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module06_module353_module2.ClassAAC = com.android.example.module06_module353_module2.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module353_module2.ClassAAE,
		param1: com.android.example.module06_module353_module2.ClassAAG,
		param2: com.android.example.module06_module353_module2.ClassAAF
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isDisposed()

		for (iAb in 0..5) {
			val local_var_3_0: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
			local_var_3_0.throwIfReached()

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.requestMore(-4543342075676111354)

			val local_var_3_2: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
			local_var_3_2.setDelegate(okio.Timeout())

			val local_var_3_3: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
			local_var_3_3.isDisposed()

		}
		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.enter()

		val local_var_2_5: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_5.timeoutNanos()

	}

	fun method1(
		param0: com.android.example.module06_module353_module2.ClassAAD,
		param1: com.android.example.module06_module353_module2.ClassAAC,
		param2: com.android.example.module06_module353_module2.ClassAAA
	) {
		param0.method3("SomeString")

	}
}
