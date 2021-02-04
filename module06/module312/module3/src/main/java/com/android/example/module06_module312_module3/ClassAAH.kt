package com.android.example.module06_module312_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module06_module246.ClassAAG = com.android.example.module06_module246.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module06_module246.ClassAAA = com.android.example.module06_module246.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module06_module246.ClassAAC = com.android.example.module06_module246.ClassAAC()
	private 	val instance_var_1_3: com.android.example.module06_module246.ClassAAG = com.android.example.module06_module246.ClassAAG()
	private 	val instance_var_1_4: com.android.example.module06_module246.ClassAAE = com.android.example.module06_module246.ClassAAE()

	fun method0(
		param0: com.android.example.module06_module246.ClassAAF
	) {
	}

	fun method1(
		param0: com.android.example.module06_module246.ClassAAD,
		param1: com.android.example.module06_module246.ClassAAG,
		param2: com.android.example.module06_module246.ClassAAE,
		param3: com.android.example.module06_module246.ClassAAD
	) {
		for (iAb in 0..2) {
			for (iAc in 0..5) {
				val local_var_4_0: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
				local_var_4_0.approveCall("SomeString", 8)

				val local_var_4_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_1.assertSubscribed()

				val local_var_4_2: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
				local_var_4_2.throwIfCanceled()

			}
			param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

			param0.method4(dagger.internal.DelegateFactory(), io.reactivex.subscribers.TestSubscriber())

			val local_var_3_0: androidx.collection.ArraySet<kotlin.Any> = androidx.collection.ArraySet()
			local_var_3_0.ensureCapacity(94)

		}
		val local_var_2_4: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_4.isCanceled()

	}

	fun method2(
		param0: com.android.example.module06_module246.ClassAAE,
		param1: com.android.example.module06_module246.ClassAAB
	) {
		val local_var_2_2: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_2.isCanceled()

		val local_var_2_3: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_3.approveCall("SomeString", 26)

		param0.method1(dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_4: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_4.throwIfCanceled()

	}

	fun method3(
		param0: com.android.example.module06_module246.ClassAAB,
		param1: com.android.example.module06_module246.ClassAAJ
	) {
		param0.method2(dagger.internal.DelegateFactory(), io.reactivex.internal.util.AppendOnlyLinkedArrayList(39))

		val local_var_2_2: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_2.isCanceled()

		param0.method0(io.reactivex.subscribers.TestSubscriber(), dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory())

	}

	fun method4(
		param0: com.android.example.module06_module246.ClassAAE,
		param1: com.android.example.module06_module246.ClassAAI,
		param2: com.android.example.module06_module246.ClassAAB,
		param3: com.android.example.module06_module246.ClassAAJ
	) {
		val local_var_2_4: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_4.cancel()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onComplete()

		val local_var_2_6: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_6.cancel()

		param0.method1(dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory(), io.reactivex.subscribers.TestSubscriber())

	}
}
