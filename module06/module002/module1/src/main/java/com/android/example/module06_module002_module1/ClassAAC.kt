package com.android.example.module06_module002_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module06_module002_module5.ClassAAI = com.android.example.module06_module002_module5.ClassAAI()
	private 	val instance_var_1_1: com.android.example.module06_module002_module5.ClassAAG = com.android.example.module06_module002_module5.ClassAAG()
	private 	val instance_var_1_2: com.android.example.module06_module002_module5.ClassAAF = com.android.example.module06_module002_module5.ClassAAF()
	private 	val instance_var_1_3: com.android.example.module06_module002_module5.ClassAAD = com.android.example.module06_module002_module5.ClassAAD()

	fun method0(
		param0: com.android.example.module06_module002_module5.ClassAAH,
		param1: com.android.example.module06_module002_module5.ClassAAF
	) {
		listOf("1", "2", "3").forEach {
			param0.method1(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), dagger.internal.DelegateFactory())

		}
	}

	fun method1(
		param0: com.android.example.module06_module002_module5.ClassAAC
	) {
	}

	fun method2(
		param0: com.android.example.module06_module002_module5.ClassAAJ,
		param1: com.android.example.module06_module002_module5.ClassAAH,
		param2: com.android.example.module06_module002_module5.ClassAAJ
	) {
		for (iAb in 0..3) {
			param0.method0(dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory())

		}
		param0.method1(dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.request(-8771620151548231325)

		val local_var_2_4: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_4.approveCall("SomeString", 79)

	}

	fun method3(
		param0: com.android.example.module06_module002_module5.ClassAAI,
		param1: com.android.example.module06_module002_module5.ClassAAJ,
		param2: com.android.example.module06_module002_module5.ClassAAA
	) {
		val local_var_2_3: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_3.isCanceled()

		val local_var_2_4: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_4.approveCall("SomeString", 32)

		val local_var_2_5: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_5.isCanceled()

	}
}
